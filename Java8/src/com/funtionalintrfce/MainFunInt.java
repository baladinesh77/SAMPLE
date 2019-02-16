package com.funtionalintrfce;

public class MainFunInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Anonymous
		Account account = new Account("Sreenadh", 10000, new InterestCalculator() {

			@Override
			public double calculate(double principal, float rate, int duration) {
				
				return principal * (rate/12) * duration;
			}
			
			
		}); 
				
		// Lambda exp
		Account acc = new Account("Rahul", 1000,  (p,r,d) -> 
			
			(p*(r/12)*d));
	
	
		System.out.println(account);
		System.out.println(acc);
	}

}
