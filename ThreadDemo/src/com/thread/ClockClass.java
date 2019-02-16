package com.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockClass implements Runnable {

	private String format;

	public ClockClass(String format) {
		super();
		this.format = format;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			LocalDateTime time = LocalDateTime.now();
			String now = time.format(DateTimeFormatter.ofPattern(format));
			System.out.println(now);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
