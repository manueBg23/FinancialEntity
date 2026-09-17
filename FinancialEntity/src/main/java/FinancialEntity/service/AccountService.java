package FinancialEntity.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import FinancialEntity.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import FinancialEntity.Mapper.AccountMapper;
import FinancialEntity.dto.AccountDto;
import FinancialEntity.repository.AccountRepository;
import FinancialEntity.repository.CustomerRepository;

@Service 
public class AccountService{

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;
    private final CustomerRepository customerRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository, 
        AccountMapper accountMapper, CustomerRepository customerRepository){
            this.accountRepository = accountRepository;
            this.accountMapper = accountMapper;
            this.customerRepository = customerRepository;
        }
    
    public List<AccountDto> getAll(){
        List<AccountEntity> accounts = accountRepository.findAll();
        return accounts.stream().map(accountMapper::toAccountM).collect(Collectors.toList());
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

        boolean customerExists = customerRepository.existsById(accountDto.getIdUserAccount()); 
        if (!customerExists) {
            throw new IllegalArgumentException("El cliente vinculado no existe en la base de datos");
        }

        if (Boolean.TRUE.equals(accountDto.getTypeAccount()) && accountDto.getBalance() < 0) {
            throw new IllegalArgumentException("La cuenta de ahorros no puede tener un saldo menor a $0.");
        }

        String accountNumber = generateAccountNumber(accountDto.getTypeAccount());
        accountDto.setNumberAccount(accountNumber);

        accountDto.setCreateDate(LocalDateTime.now());
        accountDto.setEditDate(null);

        AccountEntity entity = accountMapper.toAcountE(accountDto);
        AccountEntity saved = accountRepository.save(entity);

        return accountMapper.toAccountM(saved);
    }

    public AccountDto update(String id, AccountDto accountDto){

        AccountEntity entityActual = accountRepository.findById(id).orElse(null);

        if(entityActual == null){
            throw new IllegalArgumentException("La cuenta que intenta actualizar no existe.");
        }

        accountDto.setId(id);
        accountDto.setNumberAccount(entityActual.getNumberAccount());
        accountDto.setCreateDate(entityActual.getCreateDate());
        accountDto.setEditDate(LocalDateTime.now());

        AccountEntity entityToUpdate = accountMapper.toAcountE(accountDto);
        AccountEntity update = accountRepository.save(entityToUpdate);

        return accountMapper.toAccountM(update);
    }

    public void delete(String id){
        if (!accountRepository.existsById(id)){
            throw new IllegalArgumentException("La cuenta no existe");
        }
        this.accountRepository.deleteById(id);
    }

    private String generateAccountNumber(Boolean typeAccount){
        Random random = new Random();
        int randomDigits = 10000000 + random.nextInt(90000000);

        if (Boolean.TRUE.equals(typeAccount)){
            return "53" + randomDigits;
        }else{
            return "33" + randomDigits;
        }
    }

}