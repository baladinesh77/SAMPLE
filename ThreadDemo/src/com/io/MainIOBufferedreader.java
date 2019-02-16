package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainIOBufferedreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*BufferedInputStream stream = new BufferedInputStream(System.in);
		int i = stream.read();
		
		
		System.out.println("u entered : "+stream.toString());*/
		
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		System.out.println("u entered : "+str);*/

		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		System.out.println("u entered : "+str);
		
		
	}

}
