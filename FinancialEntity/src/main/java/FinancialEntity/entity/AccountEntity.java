package FinancialEntity.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_entity")
public class AccountEntity {

    @Id
    @Column (nullable = false)
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

/* 
• La cuenta de ahorros no puede tener un saldo menor a $0 (cero).
• Las cuentas corrientes y de ahorros se pueden activar o inactivar en cualquier momento. •
El número de las cuentas corrientes y de ahorros deben ser únicos y generarse
automáticamente, la extensión del número de cuenta debe ser de 10 dígitos numéricos. El
número de las cuentas ahorro debe iniciar en “53” y el número de las cuentas corriente debe
iniciar en “33”.
• Al crear una cuenta de ahorro esta debe establecerse como activa de forma
predeterminada. • Solo se podrán cancelar las cuentas que tengan un saldo igual a
$0.
• La fecha de creación de cada producto debe ser calculada automáticamente al registrar
el producto. • El saldo de la cuenta deberá actualizarse al realizar cualquier transacción
exitosa.
 */
