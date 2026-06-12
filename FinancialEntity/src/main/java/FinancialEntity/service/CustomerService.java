package FinancialEntity.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import FinancialEntity.entity.Customer;
import FinancialEntity.repository.CustomerRepository;

public class CustomerService implements CustomerRepository{

    private Map<String, Customer> storage = new HashMap<>();

    private CustomerRepository customerRepository = new CustomerService();

    public Customer findById(String id){
        return storage.get(id);
    }

    public Customer createCustomer(Customer customer){

        LocalDate today = LocalDate.now();
        int age = Period.between(customer.getBornDate(), today).getYears();

        if(age < 18){
            System.out.println("Usuario menor de edad no puede ser registrado");
            return null;
        }

        customer.setId(UUID.randomUUID().toString());
        customer.setCreateDate(LocalDate.now());

        //aqui se calculara la fecha de creacion

        return customer;
    }

    public Customer upDateCustomer(Customer customer){

        Customer existing = customerRepository.findById(customer.getId());

        if (existing == null){
            throw new IllegalArgumentException("El cliente no existe");
        }

        existing.setTypeId(customer.getTypeId());
        existing.setName(customer.getName());
        existing.setLastName(customer.getLastName());
        existing.setEmail(customer.getEmail());

        //se modificara y se guardara con fecha
        return customer;
    }

    public Customer deleteCustomer(Customer customer){
        //se valida si tiene productos, por ahora dejar
        return customer;
    }


}
