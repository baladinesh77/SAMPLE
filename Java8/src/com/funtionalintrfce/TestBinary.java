package com.funtionalintrfce;
import java.util.function.BinaryOperator;

public class TestBinary {
	
	
	public static void main(String[] args) {
				
		BinaryOperator<Integer> operator=(x,y)->(x<y?x:y);
		
		BinaryOperator<Integer> operator1=(x,y)-> {
			System.out.println("more method body ");
			return (x<y?x:y);
		};
		
		int x=operator1.apply(100, 102);
		System.out.println("smaller is  "+x);
		
	}

}
