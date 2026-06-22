package FinancialEntity.entity;

import java.time.LocalDate;

public class Account {

    private String id;
    private Boolean typeAccount;
    private String numberAccount;
    private String stateAccount;
    private Integer balance;
    private Boolean gmf;
    private LocalDate createDate;
    private LocalDate editDate;
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

    public LocalDate getCreateDate(){
        return createDate;
    }
    public void setCreateDate(LocalDate createDate){
        this.createDate = createDate;
    }

    public LocalDate getEditDate(){
        return editDate;
    }
    public void setEditDate(LocalDate editDate){
        this.editDate = editDate;
    }

    public String getIdUserAccount(){
        return idUserAccount;
    }
    public void setIdUserAccount(String idUserAccount){
        this.idUserAccount = idUserAccount;
    }

}
