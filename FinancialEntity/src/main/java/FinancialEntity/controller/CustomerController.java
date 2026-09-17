package FinancialEntity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FinancialEntity.dto.CustomerDto;
import FinancialEntity.service.CustomerService;

@RestController 
@RequestMapping ("/api/customer")
public class CustomerController{

    private final CustomerService customerService;

    @Autowired 
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping 
    public ResponseEntity<List<CustomerDto>> getAll(){
        return ResponseEntity.ok(this.customerService.getAll());
    }

    @GetMapping("/{idCustomer}")
    public ResponseEntity<CustomerDto> get(@PathVariable String idCustomer){
        return ResponseEntity.ok(this.customerService.get(idCustomer));
    }

    @PostMapping 
    public ResponseEntity<CustomerDto> save(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok(this.customerService.save(customerDto));
    }

    @PutMapping ("/{idCustomer}")
    public ResponseEntity<CustomerDto> update(
        @PathVariable String idCustomer,
        @RequestBody CustomerDto customer){
            return ResponseEntity.ok(this.customerService.update(idCustomer, customer));
    }

    @DeleteMapping ("/{idCustomer}")
    public ResponseEntity<Void> delete(@PathVariable String idCustomer){
        this.customerService.delete(idCustomer);
        return ResponseEntity.noContent().build();
    }

}