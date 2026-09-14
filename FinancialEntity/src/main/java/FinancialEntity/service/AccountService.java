package FinancialEntity.service;

import java.util.List;

import FinancialEntity.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import FinancialEntity.Mapper.AccountMapper;
import FinancialEntity.dto.AccountDto;
import FinancialEntity.repository.AccountRepository;

@Service 
public class AccountService{

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Autowired
    public AccountService(AccountRepository accountRepository, 
        AccountMapper accountMapper){
            this.accountRepository = accountRepository;
            this.accountMapper = accountMapper;
        }
    
    public List<AccountDto> getAll(){
        List<AccountEntity> accounts = accountRepository.findAll();
        return accountMapper.ListAccounts(accounts);
    }

    public AccountDto get(String id){
        AccountEntity entity = accountRepository.findById(id).orElse(null);
        return entity != null ? accountMapper.toAccountM(entity) : null;
    }

}
