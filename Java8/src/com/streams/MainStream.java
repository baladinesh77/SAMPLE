package com.streams;

import java.util.Arrays;

public class MainStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = new int[] {12,14,23,44,33,54,75,88,109,98};
		
		Arrays.stream(data).filter( (x) -> (x%2==0)).forEach(System.out::println);
		
		//Arrays.stream(data).map((x) -> (x*x)).forEach(System.out::println);
		
		Arrays.stream(data).filter((x) -> (x%2==0)).map((x) -> (x*x)).forEach(System.out::println);;
	}

}
