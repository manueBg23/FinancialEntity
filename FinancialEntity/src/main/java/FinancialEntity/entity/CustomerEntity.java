package FinancialEntity.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_entity")
public class CustomerEntity {

    @Id
    @Column (nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "type_id")
    private String typeId;

    @Column(name = "number_id")
    private String numberId;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "born_date")
    private LocalDate bornDate;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "edit_date")
    private LocalDateTime editDate;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getTypeId(){
        return typeId;
    }
    public void setTypeId(String typeId){
        this.typeId = typeId;
    }

    public String getNumberId(){
        return numberId;
    }
    public void setNumberId(String numberId){
        this.numberId = numberId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getBornDate(){
        return bornDate;
    }
    public void setBornDate(LocalDate bornDate){
        this.bornDate = bornDate;
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


}
