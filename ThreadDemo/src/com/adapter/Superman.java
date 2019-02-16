package com.adapter;

public class Superman implements FlyableAnimal {

	@Override
	public void jumpOff() {
		// TODO Auto-generated method stub
		System.out.println("FlyableAnimal JumpOff");
		
	}

	@Override
	public void getDown() {
		// TODO Auto-generated method stub
		System.out.println("FlyableAnimal getDown");
	}
	
	public void takeOff() {
		jumpOff();
	}

	
}
