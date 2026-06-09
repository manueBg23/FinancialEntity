package FinancialEntity.entity;

import java.time.LocalDate;

public class Customer {

    private String id;
    private String typeId;
    private String numberId;
    private String name;
    private String lastName;
    private String email;
    private LocalDate bornDate;
    private LocalDate createDate;
    private LocalDate editDate;

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
    public void setLastname(String lastName){
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

}
