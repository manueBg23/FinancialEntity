package FinancialEntity.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import FinancialEntity.entity.CustomerEntity;

@Repository 
public interface CustomerRepository extends ListCrudRepository<CustomerEntity, String>{}