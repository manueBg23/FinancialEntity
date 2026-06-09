package FinancialEntity.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

import FinancialEntity.entity.Customer;
import FinancialEntity.repository.CustomerRepository;

public class CustomerService implements CustomerRepository{

    private CustomerRepository customerRepository = new CustomerService();

    public Customer createCustomer(Customer customer){

        LocalDate today = LocalDate.now();
        int age = Period.between(customer.getBornDate(), today).getYears();

        if(age < 18){
            System.out.println("Usuario menor de edad no puede ser registrado");
            return null;
        }

        customer.setId(UUID.randomUUID().toString());
        customer.setCreateDate(LocalDate.now());
        customerRepository.upDateCustomer(customer);

        //aqui se calculara la fecha de creacion

        return customer;
    }

    public Customer upDateCustomer(Customer customer){

        //se modificara y se guardara con fecha
        return customer;
    }

    public Customer deleteCustomer(Customer customer){
        //se valida si tiene productos, por ahora dejar
        return customer;
    }


}
