package com.funtionalintrfce;

import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer [] {10, 20, 30 ,40 ,50,60});
		//list.forEach((x)->System.out.println("list elements are:"+x));

		
		list.forEach(System.out::println);
		//list.forEach(TestList::sqrt);
		
		list.removeIf((x)-> (x%2==0));		
		
		
	}
	static void sqrt(Integer x) {
		System.out.println("number"+x+"square:"+(x*x));
	}

}
