package  FinancialEntity.controller;

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

import FinancialEntity.dto.AccountDto;
import FinancialEntity.service.AccountService;

@RestController 
@RequestMapping("/api/account")
public class AccountController{

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping 
    public ResponseEntity<List<AccountDto>> getAll(){
        return ResponseEntity.ok(this.accountService.getAll());
    }

    @GetMapping("/{idAccount}")
    public ResponseEntity<AccountDto> get(@PathVariable("idAccount") String id){
        return ResponseEntity.ok(this.accountService.get(id));
    }
    
    @PostMapping
    public ResponseEntity<AccountDto> save(@RequestBody AccountDto accountDto){
        return ResponseEntity.ok(this.accountService.save(accountDto));
    }

    @PutMapping("/{idAccount}")
    public ResponseEntity<AccountDto> update(@PathVariable String id, @RequestBody AccountDto accountDto){
        this.accountService.delete(id);
        AccountDto updated = this.accountService.update(id, accountDto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping ("/{idAccount}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        this.accountService.delete(id);
        return ResponseEntity.noContent().build();
    }
   
}