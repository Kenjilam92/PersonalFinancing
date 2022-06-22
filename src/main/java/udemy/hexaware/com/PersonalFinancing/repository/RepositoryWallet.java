package udemy.hexaware.com.PersonalFinancing.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import udemy.hexaware.com.PersonalFinancing.interfaces.WalletServices;
import udemy.hexaware.com.PersonalFinancing.models.Wallet;

@Repository
@Transactional
public class RepositoryWallet implements WalletServices{
	@PersistenceContext
	EntityManager em;
//	public Wallet findById(long id) {
//		return em.find(Wallet.class,id);
//	}
	
	@Override
	public Wallet createWallet(Wallet w) {
		em.persist(w);
		return null;
	}
	
	@Override
	public Wallet createWallet(String name, String desc) {
		
		em.persist(new Wallet(name,desc,0));
		return null;
	}
	
	@Override
	public Wallet createWallet(String name, String desc, double balance) {
		em.persist(new Wallet(name,desc,balance));
		return null;
	}
	@Override
	public Wallet updateWallet(Wallet w) throws Exception {
		// TODO Auto-generated method stub
		return em.merge(w) ;
	}
	
	@Override
	public Wallet updateWallet(long id, String name, String desc, double balance) throws Exception {
		// TODO Auto-generated method stub
		Wallet w = em.find(Wallet.class, id);
		w.setBalances(balance);
		w.setName(name);
		w.setDescription(desc);
		return em.merge(w);
	}
	
	@Override
	public Wallet deleteWallet(Wallet w) throws Exception {
		em.remove(w);
		return w;
	}
	
	@Override
	public Wallet deleteWallet(long id) throws Exception {
		Wallet w = em.find(Wallet.class, id);
		em.remove(w);
		return w;
	}
	
	@Override
	public Wallet findWalletById(long id) {
	
		return em.find(Wallet.class,id);
	}
	
	
	@Override
	public List<Wallet> showAllWallet() {
		return em.createNativeQuery("select * from WALLETS").getResultList();
	}
	
	
	
	
}
