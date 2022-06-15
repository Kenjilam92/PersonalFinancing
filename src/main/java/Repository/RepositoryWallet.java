package Repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RepositoryWallet {
	@Autowired
	public RepositoryWallet() {
		// TODO Auto-generated constructor stub
	}

}
