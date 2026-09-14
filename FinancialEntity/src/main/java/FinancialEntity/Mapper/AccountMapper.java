package FinancialEntity.Mapper;

import java.util.ArrayList;
import java.util.List;

import FinancialEntity.dto.AccountDto;
import FinancialEntity.entity.AccountEntity;

public class AccountMapper {

    public AccountDto toAccountM(AccountEntity accountEntity){

        AccountDto cuenta = new AccountDto();

        cuenta.setId(accountEntity.getId());
        cuenta.setTypeAccount(accountEntity.getTypeAccount());
        cuenta.setStateAccount(accountEntity.getStateAccount());
        cuenta.setBalance(accountEntity.getBalance());
        cuenta.setGmf(accountEntity.getGmf());
        cuenta.setCreateDate(accountEntity.getCreateDate());
        cuenta.setEditDate(accountEntity.getEditDate());
        cuenta.setIdUserAccount(accountEntity.getIdUserAccount());

        return cuenta;
    }

    public AccountEntity toAcountE(AccountDto accountDto){
        
        AccountEntity salida = new AccountEntity();

        salida.setId(accountDto.getId());
        salida.setTypeAccount(accountDto.getTypeAccount());
        salida.setStateAccount(accountDto.getStateAccount());
        salida.setBalance(accountDto.getBalance());
        salida.setGmf(accountDto.getGmf());
        salida.setCreateDate(accountDto.getCreateDate());
        salida.setEditDate(accountDto.getEditDate());
        salida.setIdUserAccount(accountDto.getIdUserAccount());

        return salida;
    }

    public List<AccountDto> ListAccounts(List<AccountEntity> entities){

        List<AccountDto> accounts = new ArrayList<>();

        for(AccountEntity entity : entities){
            accounts.add(toAccountM(entity));
        }

        return accounts;
    }
    
}
