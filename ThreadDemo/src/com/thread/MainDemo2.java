package com.thread;

import java.util.Stack;

public class MainDemo2 {
	public static void main(String[] args) {
		/*Stack<Integer> stack = new Stack<>();
		
		//TWO Generator using SAME stack
		Generator g1 = new Generator(stack);
		Generator g2 = new Generator(stack);
		
		Thread t1 = new Thread(g1);
				t1.start();
		Thread t2 = new Thread(g2);
				t2.start();
		try {
		t1.join(); //for Main thread : JOIN AFTER "t1"
		t2.join();
		
		//List all data
		for(int n : stack) {
			System.out.println(n);
		}
		
		}catch(InterruptedException ex) {
			
		}*/
		
		
		MyStack stack = new MyStack( new Stack<Integer>());
		//TWO Generator using SAME stack
		Generator g1 = new Generator(stack);
		Generator g2 = new Generator(stack);
		
		Thread t1 = new Thread(g1);
				t1.start();
		Thread t2 = new Thread(g2);
				t2.start();
		try {
		t1.join(); //for Main thread : JOIN AFTER "t1"
		t2.join();
		
		//List all data
		for(int n : stack.getStack()) {
			System.out.println(n);
		}
		
		}catch(InterruptedException ex) {
			
		}
		
	}

}
