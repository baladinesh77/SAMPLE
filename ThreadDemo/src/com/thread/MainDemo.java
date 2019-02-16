package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ClockThread ct1 = new ClockThread("dd MM YYYY, hh:mm:ss");
		ClockThread ct2 = new ClockThread("hh 'hours and ' mm 'minutes, ' ss 'seconds'.");
		

		ct1.start();
		ct2.start(); */
		
		/*11 hours and  11 minutes,  19 seconds.
		11 02 2019, 11:11:19
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  20 seconds.
		11 02 2019, 11:11:20
		11 hours and  11 minutes,  21 seconds.*/
		
		/*ClockClass t1 = new ClockClass("dd MM YYYY, hh:mm:ss");
		ClockClass t2 = new ClockClass("hh 'hours and ' mm 'minutes, ' ss 'seconds'.");*/
		
	/*
		//unpredictable but bcz of Thread.sleep() it is like this.
		Thread tr1 = new Thread(t1); // runs second
		tr1.start();
		Thread tr2 = new Thread(t2); // runs second
		tr2.start(); // runs first
*/		
		
		ClockThread t1 = new ClockThread("dd MM YYYY, hh:mm:ss");
		ClockThread t2 = new ClockThread("hh 'hours and ' mm 'minutes, ' ss 'seconds'.");
				
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(t1);
		es.execute(t2);
		
		/*11 hours and  09 minutes,  37 seconds.
		11 02 2019, 11:09:37
		11 hours and  09 minutes,  37 seconds.
		11 02 2019, 11:09:37
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  38 seconds.
		11 02 2019, 11:09:38
		11 hours and  09 minutes,  39 seconds.
		11 02 2019, 11:09:39*/
		
		
	}

}
