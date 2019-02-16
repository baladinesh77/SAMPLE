package com.io;

import java.io.IOException;

public class MainCIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hi I am herer"); 
		System.err.println("Hi I am in red as err"); // red color
		
		System.out.println(System.in); // returns BufferedinputStream
		
		byte[] data = new byte[10];
		
		//read few butes from input stream
		int length = System.in.read(data);
		// includes 2 bytes for line-break + input char length
		System.out.println("u have entered "+length + " bytes");
		
		//converet all bytes read into string
		String str = new String(data,0,length);
		System.out.println("u entered : "+str);

	}

}
