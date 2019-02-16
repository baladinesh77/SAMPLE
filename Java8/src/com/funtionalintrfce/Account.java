package com.funtionalintrfce;

public class Account {

	private String name;
	private double amount;
	private double interest;
	
	private InterestCalculator calculator;
	
	public Account(String name, double amount,
			InterestCalculator interestCalculator) {
		super();
		this.name = name;
		this.amount = amount;
		this.calculator = interestCalculator;
		this.interest = interestCalculator.calculate(amount,0.10F,12); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", amount=" + amount + ", interest=" + interest + ", calculator=" + calculator
				+ "]";
	}
	
	
	
}
