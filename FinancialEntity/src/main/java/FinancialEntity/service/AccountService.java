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

    public AccountDto getById(String id) {
        AccountEntity entity = accountRepository.findById(id).orElse(null);
        return entity != null ? accountMapper.toAccountM(entity) : null;
    }

    public AccountDto save(AccountDto accountDto){
        AccountEntity entity = accountMapper.toAcountE(accountDto);
        AccountEntity saved = accountRepository.save(entity);

        return accountMapper.toAccountM(saved);
    }

    public AccountDto update(String id, AccountDto accountDto){

        AccountEntity entityActual = accountRepository.findById(id).orElse(null);

        if(entityActual == null){
            return null;
        }

        accountDto.setId(id);
        AccountEntity entityToUpdate = accountMapper.toAcountE(accountDto);
        AccountEntity update = accountRepository.save(entityToUpdate);

        return accountMapper.toAccountM(update);
    }

    public void delete(String id){
        this.accountRepository.deleteById(id);
    }

}
