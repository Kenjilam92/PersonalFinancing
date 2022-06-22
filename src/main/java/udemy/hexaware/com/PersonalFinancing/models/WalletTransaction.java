package udemy.hexaware.com.PersonalFinancing.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="WalletTransactions")
public class WalletTransaction {
	
	@Id
	@GeneratedValue
	private long id;
	@Column(name="Store")
	private	String store;
	@Column(name="Description")
	private String description;
	@Column(name="Category")
	private String category;
	@Column(name="amount")
	private double amount;
	@ManyToOne
	private Wallet wallet;
	@Column(name="Transaction_date")
	private LocalDate transactionDate;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updateDate;

	public WalletTransaction() {}
	
	public WalletTransaction(double amount, String store, String description, String category, Wallet wallet) {
		super();
		this.amount = amount;
		this.store = store;
		this.description = description;
		this.category = category;
//		this.wallet = wallet;
	}

	public WalletTransaction(double amount, String store, String category, Wallet wallet) {
		super();
		this.amount = amount;
		this.store = store;
		this.category = category;
//		this.wallet = wallet;
	}

	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

//	public Wallet getWallet() {
//		return wallet;
//	}
//
//	public void setWallet(Wallet wallet) {
//		this.wallet = wallet;
//	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	
}
