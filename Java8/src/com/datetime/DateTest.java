package com.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.minusDays(1));
		System.out.println(today.minusMonths(3));
		System.out.println(today.plusYears(5));
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time.plusMinutes(10));
		System.out.println(time.minusHours(1));
		System.out.println(time.MIDNIGHT);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s= "01:04:1990";
		Date  d= new Date();
		String formattedDate=df.format(d);
		System.out.println("formattedDate"+formattedDate);
	}

}
