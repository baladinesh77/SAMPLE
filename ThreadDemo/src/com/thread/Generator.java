package com.thread;

import java.util.Stack;

public class Generator implements Runnable {

	//private Stack<Integer> stack;
	
	private volatile MyStack stack;
	
	/*public Generator(Stack<Integer> stack) {
		super();
		this.stack = stack;
	}*/

	public Generator(MyStack stack) {
		super();
		this.stack = stack;
	}
	
	/*@Override
	public void run() {
		
		synchronized (stack) {
		
			for(int i=0;i<10 ;i++) {
				stack.push(i);
				try {
				Thread.sleep(100);
				}catch(InterruptedException ex) {}
			}
			System.out.println("Numbers Generated!");
		}
	}*/

	@Override
	public void run() {
		
		
			for(int i=0;i<10 ;i++) {
				stack.push(i);
				
		
			}
	}
}
