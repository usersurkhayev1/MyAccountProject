package MyAccountProject.service;

import MyAccountProject.entity.AccountModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    List<AccountModel> getAllAccounts();
    AccountModel getAccountById(Long id);
    void createAccount(AccountModel accountModel);
    void updateAccount(AccountModel accountModel,Long id);
    void deleteAccountById(Long id);
    void deleteAllAccounts();

}
