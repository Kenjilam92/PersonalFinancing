package udemy.hexaware.com.PersonalFinancing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Repository.RepositoryWallet;

@SpringBootApplication
public class PersonalFinancingApplication {
	@Autowired
	static RepositoryWallet repo;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(PersonalFinancingApplication.class, args);
		
		//System.out.print(repo.findById(1));
	}

}
