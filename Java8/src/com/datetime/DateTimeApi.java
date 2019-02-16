package com.datetime;

import java.util.Date;

public class DateTimeApi {

	public static void main(String[] args) {
		//Thread t = new Thread(()->clock());
		//1. find the argument type runnable
		//1.a.if argument type is not a functional interface raise an error
		//1/b. if the argument type is functional  interface 
		
		
		Thread t = new Thread(new Runnable() {
	
	@Override
	public void run() {
	clock();
		
	}
		
}
	);
		t.start();
	}
	private static void clock() {
		while(true) {
			System.out.println(new Date());
		}
	}

}
