package Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import models.Wallet;

@Repository
@Transactional
public class RepositoryWallet {
	@PersistenceContext
	EntityManager em;
	public Wallet findById(long id) {
		return em.find(Wallet.class,id);
	}

}
