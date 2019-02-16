package com.collection;

public class Transaction {

	private AccountManager manager;
	
	public Transaction (AccountManager manager) {
		super();
		this.manager = manager;
	}
	
	public void withdraw(Integer id,Double amount) {
		Account account = manager.findAccount(id);
		if(account == null) {
			throw new RuntimeException ("Cant withdraw amount");
		}
		double temp = account.getBalance();
		temp = temp - amount;
		if(temp < 0) {
			throw new RuntimeException("no sufficient balance");
		}
		account.setBalance(temp);
	} 
	
	public void deposit(Integer id, Double amount) {
		
		Account account = manager.findAccount(id);
		if(account == null) {
			throw new RuntimeException ("Cant withdraw amount");
		}
		double temp = account.getBalance() + amount;
		account.setBalance(temp);
		
	}
	
	public void transfer(Integer id1, Integer id2, double amount) {
		this.withdraw(id1, amount);
		this.deposit(id2, amount);
		
	}
	
}
