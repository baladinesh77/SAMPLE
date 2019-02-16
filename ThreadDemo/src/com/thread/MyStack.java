package com.thread;

import java.util.Stack;

public class MyStack {

	private Stack<Integer> stack;

	public MyStack(Stack<Integer> stack) {
		this.stack = stack;
	}

	public synchronized void push(int n) {
		System.out.println(Thread.currentThread().getName() + " Adding " + n);
		delay();
		stack.push(n);
		delay();
		System.out.println(Thread.currentThread().getName() + " Added " + n);
	}

	public Stack<Integer> getStack() {
		return stack;
	}
	
	public synchronized void pop() {
		System.out.println(Thread.currentThread().getName() + " deleting ");
		delay();
		int n = stack.pop();
		delay();
		System.out.println(Thread.currentThread().getName() + " deleted " + n);
	}
	
	public boolean isEmpty() {
		
		return true;
	} 
	
	
	public void delay() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
