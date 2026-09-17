package FinancialEntity.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import FinancialEntity.Mapper.CustomerMapper;
import FinancialEntity.dto.CustomerDto;
import FinancialEntity.entity.CustomerEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FinancialEntity.repository.AccountRepository;
import FinancialEntity.repository.CustomerRepository;

@Service 
public class CustomerService {

    
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final AccountRepository accountRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository,
         CustomerMapper customerMapper, AccountRepository accountRepository) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
        this.accountRepository = accountRepository;
    }

    public List<CustomerDto> getAll(){

        List<CustomerEntity> customers = customerRepository.findAll();
        return customers.stream().map(customerMapper::toCustomerM).collect(Collectors.toList());
    }

    public CustomerDto get(String idCustomer){
        CustomerEntity entity = customerRepository.findById(idCustomer).orElse(null);
        return entity != null ? customerMapper.toCustomerM(entity) : null;
    }

    public CustomerDto save(CustomerDto customerDto){

        if (customerDto.getName() == null || customerDto.getName().length() < 2 ||
            customerDto.getLastName() == null || customerDto.getLastName().length() < 2){
                throw new IllegalArgumentException("El nombre y el apellido deben tener al menos e caracteres");
            }
        
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        if (customerDto.getEmail() == null || !Pattern.matches(emailRegex, customerDto.getEmail())) {
            throw new IllegalArgumentException("El formato del correo electrónico no es válido.");
        }

        if (customerDto.getBornDate() == null) {
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria.");
        }
        int age = Period.between(customerDto.getBornDate(), LocalDate.now()).getYears();
        if (age < 18) {
            throw new IllegalArgumentException("El cliente no puede ser registrado porque es menor de edad.");
        }
    
        CustomerEntity entity = customerMapper.toCustomerE(customerDto);
        CustomerEntity saved = customerRepository.save(entity);

        return customerMapper.toCustomerM(saved);
    }

    public CustomerDto update(String idCustomer, CustomerDto customerDto){

        CustomerEntity entityActual = customerRepository.findById(idCustomer).orElse(null);

        if(entityActual == null) {
            throw new IllegalArgumentException("El cliente que intenta actualizar no existe.");
        }

        customerDto.setId(idCustomer);
        customerDto.setCreateDate(entityActual.getCreateDate());

        customerDto.setEditDate(LocalDateTime.now());

        customerDto.setId(idCustomer);
        CustomerEntity entityToUpdate = customerMapper.toCustomerE(customerDto);
        CustomerEntity updated = customerRepository.save(entityToUpdate);

        return customerMapper.toCustomerM(updated);
    }

    public void delete(String idCustomer){
       if (!customerRepository.existsById(idCustomer)) {
            throw new IllegalArgumentException("El cliente no existe.");
        }

        boolean hasAccounts = accountRepository.existsByIdUserAccount(idCustomer);
        if (hasAccounts) {
            throw new IllegalArgumentException("No se puede eliminar el cliente porque tiene cuentas bancarias vinculadas.");
        }

        this.customerRepository.deleteById(idCustomer);
    }
    
}

