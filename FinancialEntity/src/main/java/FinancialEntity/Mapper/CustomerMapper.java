package FinancialEntity.Mapper;

import FinancialEntity.dto.CustomerDto;
import FinancialEntity.entity.CustomerEntity;

public class CustomerMapper {

    public CustomerDto toCustomerM(CustomerEntity customerEntity){

        CustomerDto model = new CustomerDto();

        model.setId(customerEntity.getId());
        model.setTypeId(customerEntity.getTypeId());
        model.setNumberId(customerEntity.getNumberId());
        model.setName(customerEntity.getName());
        model.setLastName(customerEntity.getLastName());
        model.setEmail(customerEntity.getEmail());
        model.setBornDate(customerEntity.getBornDate());
        model.setCreateDate(customerEntity.getCreateDate());
        model.setEditDate(customerEntity.getEditDate());

        return model;
    }

    public CustomerEntity toCustomerE(CustomerDto customerDto){

        CustomerEntity entity = new CustomerEntity();

        entity.setId(customerDto.getId());
        entity.setTypeId(customerDto.getTypeId());
        entity.setNumberId(customerDto.getNumberId());
        entity.setName(customerDto.getName());
        entity.setLastName(customerDto.getLastName());
        entity.setEmail(customerDto.getEmail());
        entity.setBornDate(customerDto.getBornDate());
        entity.setCreateDate(customerDto.getCreateDate());
        entity.setEditDate(customerDto.getEditDate());

        return entity;

    }

}
