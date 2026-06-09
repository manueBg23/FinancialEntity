package FinancialEntity.service;

import java.time.LocalDate;
import java.util.UUID;

import FinancialEntity.entity.Customer;
import FinancialEntity.repository.CustomerRepository;

public class CustomerService implements CustomerRepository{

    private CustomerRepository customerRepository = new CustomerService();

    public String findById(String id){
        /*if (id <= 18){

        }*/

        //menor que 18, imprimir= menor de edad el usuario no se puede crear
        //mayor que 18, enviar el id a createCustomer
        //es necesario tener en cuenta la fehca de nacimiento porque aqui se valida

        return id;
    }

    public Customer createCustomer(Customer customer){

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
