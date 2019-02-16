package com.thread;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockThread extends Thread {

	private String format;

	public ClockThread(String format) {
		super();
		this.format = format;
	}
	
	public void run () {
		
		while(true) {
			LocalDateTime time = LocalDateTime.now();
			String now = time.format(DateTimeFormatter.ofPattern(format));
			System.out.println(now);
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	}
	
}
