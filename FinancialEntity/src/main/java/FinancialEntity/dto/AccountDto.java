package FinancialEntity.dto;

import FinancialEntity.entity.Account;
import FinancialEntity.entity.AccountEntity;

public class AccountDto {

    public Account toAccountM(AccountEntity ayNose){

        Account cuenta = new Account();

        cuenta.setId(ayNose.getId());
        cuenta.setTypeAccount(ayNose.getTypeAccount());
        cuenta.setStateAccount(ayNose.getStateAccount());
        cuenta.setBalance(ayNose.getBalance());
        cuenta.setGmf(ayNose.getGmf());
        cuenta.setCreateDate(ayNose.getCreateDate());
        cuenta.setEditDate(ayNose.getEditDate());
        cuenta.setIdUserAccount(ayNose.getIdUserAccount());

        return cuenta;
    }

    public AccountEntity toAcountE(Account modelo){
        
        AccountEntity salida = new AccountEntity();

        salida.setId(modelo.getId());
        salida.setTypeAccount(modelo.getTypeAccount());
        salida.setStateAccount(modelo.getStateAccount());
        salida.setBalance(modelo.getBalance());
        salida.setGmf(modelo.getGmf());
        salida.setCreateDate(modelo.getCreateDate());
        salida.setEditDate(modelo.getEditDate());
        salida.setIdUserAccount(modelo.getIdUserAccount());

        return salida;
    }
    
}
