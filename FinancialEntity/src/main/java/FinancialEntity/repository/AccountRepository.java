package FinancialEntity.repository;

import org.springframework.stereotype.Repository;

import FinancialEntity.entity.AccountEntity;
import org.springframework.data.repository.ListCrudRepository;

@Repository 
public interface AccountRepository extends ListCrudRepository<AccountEntity, String> {}