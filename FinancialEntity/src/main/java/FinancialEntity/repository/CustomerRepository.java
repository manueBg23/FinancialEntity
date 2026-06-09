package FinancialEntity.repository;

import FinancialEntity.entity.Customer;

public interface CustomerRepository {

    public String findById(String id);

    public Customer createCustomer(Customer customer);
     //siendo menor de edad no se podra crear
     // fecha de creacion calculada automaticamente

    public Customer upDateCustomer(Customer customer);
     //guardar fecha de modificación

    public Customer deleteCustomer(Customer customer);
     //teniendo productos no se podra eliminar

}
