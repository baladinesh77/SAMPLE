package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountDAO {

	private List<Account> accounts = new ArrayList<>();
	
	public void add(Account acc) {
		accounts.add(acc);
	}
	
	public void find(String accNo) {
		//open the stream
		accounts.stream(). // open the internal rep of list
		// check for the condition and perform the opration
		filter((a) -> a.getAccNo().equalsIgnoreCase(accNo)).
		findFirst(); // clost the stream and return
		
		// 
	}
	
	//Shortest method chain with Stream
	public void display() {
		accounts.stream().forEach(System.out::println);
	}

	public List<Account> findBalanceBelow(double amt) {
		return accounts.stream().filter((x) -> 
		x.getBalance() < amt).collect(Collectors.toList());
	}

	//Shortest method chain with Stream
	public void findByCustomerName(String customerName) {
		accounts.stream().filter((x) -> x.getCustomer().
				equalsIgnoreCase(customerName)).collect(Collectors.toList());
	}
	
	public void findByCustomerWithBalanceBelow(double amt) {
		
		accounts.stream().filter((x) -> x.getBalance()<amt).
		map((x) -> x.getCustomer()).collect(Collectors.toList());
		
		//parallel stream
		accounts.parallelStream().filter((x) -> x.getBalance()<amt).
		map((x) -> x.getCustomer()).collect(Collectors.toList());
	}
}
