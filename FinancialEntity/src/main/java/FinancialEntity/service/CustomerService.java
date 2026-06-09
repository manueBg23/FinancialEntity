package FinancialEntity.service;

import java.time.LocalDate;
import java.util.UUID;

import FinancialEntity.entity.Customer;
import FinancialEntity.repository.CustomerRepository;

public class CustomerService implements CustomerRepository{

    private CustomerRepository customerRepository = new CustomerService();

    public Customer createCustomer(Customer customer){

        customer.setId(UUID.randomUUID().toString());
        customer.setCreateDate(LocalDate.now());
        customerRepository.upDateCustomer(customer);

        return customer;
    }

    public Customer upDateCustomer(Customer customer){
        return customer;
    }

    public Customer deleteCustomer(Customer customer){
        return customer;
    }


}
