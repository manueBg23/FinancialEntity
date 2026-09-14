package FinancialEntity.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_entity")
public class AccountEntity {

    @Id
    @Column (nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="type_account")
    private Boolean typeAccount;

    @Column(name="number_account")
    private String numberAccount;

    @Column(name="state_account")
    private String stateAccount;

    private Integer balance;

    private Boolean gmf;

    @Column(name="create_date")
    private LocalDate createDate;

    @Column(name="edit_date")
    private LocalDate editDate;

    @Column(name="id_user_account")
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
    public void setStateAccount(String stateAcount){
        this.stateAccount = stateAcount;
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