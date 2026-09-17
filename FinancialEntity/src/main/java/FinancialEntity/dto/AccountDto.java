package FinancialEntity.dto;

import java.time.LocalDateTime;

public class AccountDto {

    private String id;
    private Boolean typeAccount;
    private String numberAccount;
    private String stateAccount;
    private Integer balance;
    private Boolean gmf;
    private LocalDateTime createDate;
    private LocalDateTime editDate;
    private String idUserAccount;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public Boolean getTypeAccount(){
        return typeAccount;
    }
    public void setTypeAccount(Boolean typeAccount){
        this.typeAccount = typeAccount;
    }

    public String getNumberAccount(){
        return numberAccount;
    }
    public void setNumberAccount(String numberAccount){
        this.numberAccount = numberAccount;
    }

    public String getStateAccount(){
        return stateAccount;
    }
    public void setStateAccount(String stateAccount){
        this.stateAccount = stateAccount;
    }

    public Integer getBalance(){
        return balance;
    }
    public void setBalance(Integer balance){
        this.balance = balance;
    }

    public Boolean getGmf(){
        return gmf;
    }
    public void setGmf(Boolean gmf){
        this.gmf = gmf;
    }

    public LocalDateTime getCreateDate(){
        return createDate;
    }
    public void setCreateDate(LocalDateTime createDate){
        this.createDate = createDate;
    }

    public LocalDateTime getEditDate(){
        return editDate;
    }
    public void setEditDate(LocalDateTime editDate){
        this.editDate = editDate;
    }

    public String getIdUserAccount(){
        return idUserAccount;
    }
    public void setIdUserAccount(String idUserAccount){
        this.idUserAccount = idUserAccount;
    }

}
