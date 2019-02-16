package com.collection;

public class Account implements Comparable<Account> {

	private String accNo;
	private String customer;
	private double balance;
	
	public String getAccNo() {
		return accNo;
	}


	public Account(String accNo, String customer, double balance) {
		super();
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}



	public String getCustomer() {
		return customer;
	}



	public void setCustomer(String customer) {
		this.customer = customer;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	
	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.customer.compareTo(o.getCustomer());
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", customer=" + customer + ", balance=" + balance + "]";
	}
	

}
