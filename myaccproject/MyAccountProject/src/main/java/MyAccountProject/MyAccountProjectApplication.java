package MyAccountProject;

import MyAccountProject.entity.AccountModel;
import MyAccountProject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAccountProjectApplication implements CommandLineRunner {

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyAccountProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AccountModel accountModel = new AccountModel();
		accountModel.setUsername("surkhayev");
		accountModel.setPassword("dev1234");
		accountModel.setFin_code("4t6rbgk");
		accountModel.setEmail("surkhayevm@gmail.com");

		accountRepository.save(accountModel);

	}
}
