package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class AccountManager {

	Map<Integer,Account> accounts = new TreeMap<>();
	
	public void addNew(Account acc, Integer id) {
		accounts.put(id,acc);
	}
	
	public Account findAccount(Integer id) {
		return accounts.get(id);
	}
	
	public void printAccounts() {
		for(Map.Entry<Integer, Account> map : accounts.entrySet()) {
			System.out.println(map.getKey() + " : "+map.getValue());
		}
	}
}
