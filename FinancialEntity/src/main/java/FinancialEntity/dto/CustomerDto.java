package FinancialEntity.dto;

import FinancialEntity.entity.Customer;
import FinancialEntity.entity.CustomerEntity;

public class CustomerDto {

    public Customer toCustomerM(CustomerEntity entity){

        Customer model = new Customer();

        model.setId(entity.getId());
        model.setTypeId(entity.getTypeId());
        model.setNumberId(entity.getNumberId());
        model.setName(entity.getName());
        model.setLastName(entity.getLastName());
        model.setEmail(entity.getEmail());
        model.setBornDate(entity.getBornDate());
        model.setCreateDate(entity.getCreateDate());
        model.setEditDate(entity.getEditDate());

        return model;
    }

    public CustomerEntity toCustomerE(Customer model){

        CustomerEntity entity = new CustomerEntity();

        entity.setId(model.getId());
        entity.setTypeId(model.getTypeId());
        entity.setNumberId(model.getNumberId());
        entity.setName(model.getName());
        entity.setLastName(model.getLastName());
        entity.setEmail(model.getEmail());
        entity.setBornDate(model.getBornDate());
        entity.setCreateDate(model.getCreateDate());
        entity.setEditDate(model.getEditDate());

        return entity;

    }

}
