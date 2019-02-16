package com.funtionalintrfce;

@FunctionalInterface
public interface InterestCalculator {

	double calculate(double principal, float rate, int duration);
	//void show();

}
