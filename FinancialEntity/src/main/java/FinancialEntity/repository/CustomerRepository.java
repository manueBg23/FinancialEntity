package FinancialEntity.repository;

import FinancialEntity.entity.Customer;

public interface CustomerRepository {

    public Customer findById(String id);

    public Customer createCustomer(Customer customer);

    public Customer upDateCustomer(Customer customer);

    public Customer deleteCustomer(Customer customer);
  

}
