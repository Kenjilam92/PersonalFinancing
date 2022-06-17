package udemy.hexaware.com.PersonalFinancing.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import udemy.hexaware.com.PersonalFinancing.models.Wallet;

@Repository
@Transactional
public class RepositoryWallet {
	@PersistenceContext
	EntityManager em;
	public Wallet findById(long id) {
		return em.find(Wallet.class,id);
	}

}
