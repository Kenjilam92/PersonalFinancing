package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Repository.RepositoryWallet;
import models.Wallet;

@RequestMapping("/api/v1/")
@RestController

public class WalletController {
<<<<<<< HEAD
	@GetMapping("/wallets")
	public String show() {
		return "this will show all wallets";
=======
	public WalletController() {
	}
	
	@Autowired
	private RepositoryWallet repo; 
	
	@GetMapping(path="wallets",produces= { "application/json" })
	public ResponseEntity<Wallet> show() {
		Wallet w = new Wallet("Bank A", "this is created at the controller", 10.23);
		return new ResponseEntity<>(w,HttpStatus.OK);
	}
	
	@GetMapping("wallet1")
	public ResponseEntity<Wallet> showWalletOne() {
		Wallet w = repo.findById(1);
		return new ResponseEntity<>(w,HttpStatus.OK);
>>>>>>> 02f32b703b634c7cd2bd09ec9c6aeaf5be318be3
	}
}
