package FinancialEntity.service;

import java.util.HashMap;
import java.util.Map;

import FinancialEntity.entity.Account;
import FinancialEntity.repository.AccountRepository;

public class AccountService implements AccountRepository{

    private Map<String, Account> storage = new HashMap<>();

    private AccountRepository accountRepository = new AccountService();

    public Account findById(String id){
        return storage.get(id);
    }

    public Account createAccount(Account account){
        return account;
    }

    public Account upDateAccount(Account account){

        Account existing = accountRepository.findById(account.getId());

        if (existing == null){
            throw new IllegalArgumentException("El cliente no existe");
        }

        existing.setBalance(account.getBalance());
        existing.setGmf(account.getGmf());
        existing.setStateAccount(account.getStateAccount());
        existing.setTypeAccount(account.getTypeAccount());

        return account;
    }

    public Account deleteAccount(Account account){
        return account;
    }

    
}
