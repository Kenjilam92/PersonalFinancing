package udemy.hexaware.com.PersonalFinancing.interfaces;

import java.util.*;

import udemy.hexaware.com.PersonalFinancing.models.Wallet;

public interface WalletServices {
	
	public Wallet createWallet (String name, String desc);
	public Wallet createWallet (String name, String desc, double balance);
	
	public Wallet updateWallet (Wallet w) throws Exception ;
	public Wallet updateWallet (long id,String name, String desc, double balance) throws Exception ;
	
	public Wallet deleteWallet (Wallet w) throws Exception;
	public Wallet deleteWallet (long id) throws Exception;
	
	public Wallet findWalletById (long id);
	public List<Wallet> showAllWallet();
}
