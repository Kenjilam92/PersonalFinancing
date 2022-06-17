package udemy.hexaware.com.PersonalFinancing.models;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Wallets")
public class Wallet {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="Name")
	private String name;
	@Column(name="Description")
	private String description;
	@Column(name="Balances")
	private double balances;
//	@OneToMany(mappedBy="wallet")
//	private List<WalletTransaction> transactions;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	public Wallet() {}
	
	public Wallet(String name, String description, double balances) {
		this.name = name;
		this.description = description;
		this.balances = balances;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalances() {
		return balances;
	}
	public void setBalances(double balances) {
		this.balances = balances;
	}
//	public List<WalletTransaction> getTransactions() {
//		return transactions;
//	}
//	public void setTransactions(List<WalletTransaction> transactions) {
//		this.transactions = transactions;
//	}
	@Override
	public String toString() {
		return "Wallet [id=" + id + ", name=" + name + ", description=" + description + ", balances=" + balances
				+ ", createdDate=" + createdDate + ", updateDate=" + updateDate + "]";
	}
	
	

}
