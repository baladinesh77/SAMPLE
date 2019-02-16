package com.thread;

import java.util.Stack;

public class Degenerator implements Runnable {

	public Degenerator(Stack stack) {
		super();
		this.stack = stack;
	}


	private Stack stack;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("attempting pop");
			if(stack.isEmpty()) {
				System.out.println("stack is empty, retrying");
				try {
					stack.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				stack.pop();
				stack.notifyAll();
			}
		}
	}

	
}
