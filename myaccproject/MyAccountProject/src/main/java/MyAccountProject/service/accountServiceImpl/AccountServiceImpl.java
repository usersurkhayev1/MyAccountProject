package MyAccountProject.service.accountServiceImpl;

import MyAccountProject.entity.AccountModel;
import MyAccountProject.repository.AccountRepository;
import MyAccountProject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<AccountModel> getAllAccounts() {

        return accountRepository.findAll();
    }

    @Override
    public AccountModel getAccountById(Long id) {

        AccountModel account = accountRepository.findById(id).get();

        if (account == null) {
            throw new NullPointerException("account is null !");
        }
        return account;
    }

    @Override
    public void createAccount(AccountModel accountModel) {

        accountRepository.save(accountModel);
    }

    @Override
    public void updateAccount(AccountModel accountModel, Long id) {

        AccountModel oldaccountModel = accountRepository.findById(id).get();

        oldaccountModel.setUsername(accountModel.getUsername());
        oldaccountModel.setPassword(accountModel.getPassword());
        oldaccountModel.setFin_code(accountModel.getFin_code());
        oldaccountModel.setEmail(accountModel.getEmail());

        accountRepository.save(oldaccountModel);
    }

    @Override
    public void deleteAccountById(Long id) {

        if (id == null) {
            throw new NullPointerException("ID is null !");
        }
        accountRepository.deleteById(id);
    }

    @Override
    public void deleteAllAccounts() {

        List<AccountModel> accounts = accountRepository.findAll();

        accountRepository.deleteAll(accounts);

    }
}