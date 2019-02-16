package com.io;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileCopy filecopy = new FileCopy("D:\\IO-1.jpg",
				"D:\\IO-2.jpg");
		
		new Thread(filecopy).start();
		
	}

}
