package MyAccountProject.controller;

import MyAccountProject.entity.AccountModel;
import MyAccountProject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/accounts")
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/getListAccounts")
    public List<AccountModel> getAllAccount() {

        return accountService.getAllAccounts();
    }

    @GetMapping("/getAccountById/{id}")
    public AccountModel getAccountById(@PathVariable Long id) {

        return accountService.getAccountById(id);
    }

    @PostMapping("/createAccount")
    public void createAccount(@RequestBody AccountModel accountModel) {

        accountService.createAccount(accountModel);
    }

    @PutMapping("/updateAccount/{id}")
    public void updateAccount(@RequestBody AccountModel accountModel, @PathVariable Long id) {

        accountService.updateAccount(accountModel, id);
    }

    @DeleteMapping("/deleteAccountById/{id}")
    public void deleteAccountById(@PathVariable Long id) {

        accountService.deleteAccountById(id);
    }

    @DeleteMapping("/deleteAllAccounts")
    public void deleteAllAccounts() {

        accountService.deleteAllAccounts();
    }
}