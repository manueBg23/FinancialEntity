package FinancialEntity.repository;

import FinancialEntity.entity.Account;

public interface AccountRepository {

    public Account findById(String id);

    public Account createAccount(Account account);

    public Account upDateAccount(Account account);

    public Account deleteAccount(Account account);
    
}
