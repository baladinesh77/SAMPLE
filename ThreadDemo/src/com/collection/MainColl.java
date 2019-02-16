package com.collection;

public class MainColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountManager accManager = new AccountManager();
		accManager.addNew(new Account("123243243","vijay mallaya", 2000.00), 103);
		accManager.addNew(new Account("123253453","Nirav Modi", 10000.00), 102);
		accManager.addNew(new Account("12324323343","gijay mallaya", 2000.00), 108);
		accManager.addNew(new Account("1233253453","sdf Modi", 10000.00), 100);
		accManager.addNew(new Account("123355243243","df mallaya", 2000.00), 105);
		accManager.addNew(new Account("1232534336653","cisdfrav Modi", 10000.00), 112);
		accManager.printAccounts();
		
		
		
		Transaction tx = new Transaction(accManager);
		tx.transfer(102,103,1000D);
		
		
		System.out.println("Now balance");
		System.out.println("Nirav Balance"+accManager.findAccount(102).getBalance());
		System.out.println("Vijay Mallya balance"+accManager.findAccount(103).getBalance());
		System.out.println("Now balance");
		
		
	}

}
