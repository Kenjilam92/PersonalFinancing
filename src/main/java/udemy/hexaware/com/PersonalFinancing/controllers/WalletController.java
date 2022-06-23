package udemy.hexaware.com.PersonalFinancing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return new ResponseEntity<>(repo.showAllWallets(),HttpStatus.OK);
	}
	
	@GetMapping("wallet/{id}")
	public ResponseEntity<Wallet> showWalletById(@PathVariable("id")long id ) {
		return new ResponseEntity<>(repo.findWalletById(id),HttpStatus.OK);

	}
	
	@PostMapping("wallet")
	public ResponseEntity<Wallet> createWallet(@Validated @RequestBody Wallet w){
//		System.out.println("#################################################################");
		//System.out.println(w);
		repo.createWallet(w);
		return new ResponseEntity<>(w,HttpStatus.OK);
	}
	
	@DeleteMapping("wallet")
	public ResponseEntity<List<Wallet>> deleteWallet(@Validated @RequestBody Wallet w ) throws Exception {
		return new ResponseEntity<>(repo.deleteWallet(w),HttpStatus.OK);
	}
	
	@PutMapping("wallet")
	public ResponseEntity<Wallet> updateWallet(@Validated @RequestBody Wallet w) throws Exception{
		return new ResponseEntity<>(repo.updateWallet(w),HttpStatus.OK);
	}
}
