package FinancialEntity.service;

import java.util.List;
import FinancialEntity.Mapper.CustomerMapper;
import FinancialEntity.dto.CustomerDto;
import FinancialEntity.entity.CustomerEntity;

import org.springframework.beans.factory.annotation.Autowired;

import FinancialEntity.repository.CustomerRepository;

public class CustomerService {

    
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerService(CustomerRepository customerRepository,
         CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public List<CustomerDto> getAll(){

        List<CustomerEntity> customers = customerRepository.findAll();
        return customerMapper.listCustomers(customers);
    }

    public CustomerDto get(String idCustomer){
        CustomerEntity entity = customerRepository.findById(idCustomer).orElse(null);
        return entity != null ? customerMapper.toCustomerM(entity) : null;
    }

    public CustomerDto save(CustomerDto customer){
        CustomerEntity entity = customerMapper.toCustomerE(customer);
        CustomerEntity saved = customerRepository.save(entity);

        return customerMapper.toCustomerM(saved);
    }

    public CustomerDto update(String idCustomer, CustomerDto customer){

        CustomerEntity entityActual = customerRepository.findById(idCustomer).orElse(null);

        if(entityActual == null) {
            return null;
        }

        customer.setId(idCustomer);
        CustomerEntity entityToUpdate = customerMapper.toCustomerE(customer);
        CustomerEntity updated = customerRepository.save(entityToUpdate);

        return customerMapper.toCustomerM(updated);
    }

    public void delete(String idCustomer){
        this.customerRepository.deleteById(idCustomer);
    }
    
}

