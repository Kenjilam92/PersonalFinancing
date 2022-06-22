package udemy.hexaware.com.PersonalFinancing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import udemy.hexaware.com.PersonalFinancing.models.Wallet;
import udemy.hexaware.com.PersonalFinancing.repository.RepositoryWallet;

@RequestMapping("/api/v1/")
@RestController

public class WalletController {

	public WalletController() {
	}
	
	@Autowired
	private RepositoryWallet repo; 
	
	@GetMapping(path="wallets",produces= { "application/json" })
	public ResponseEntity<List<Wallet>> showAll() {
		return new ResponseEntity<>(repo.showAllWallet(),HttpStatus.OK);
	}
	
	@GetMapping("wallet/{id}")
	public ResponseEntity<Wallet> showWalletOne(@PathVariable("id")long id ) {
		Wallet w = repo.findWalletById(id);
		return new ResponseEntity<>(w,HttpStatus.OK);

	}
}
