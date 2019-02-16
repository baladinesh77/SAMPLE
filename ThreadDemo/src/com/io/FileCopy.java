package com.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class FileCopy implements Runnable {

	private String sourceFile;
	private String destFile;

	public FileCopy(String sourceFile, String destFile) {
		super();
		this.sourceFile = sourceFile;
		this.destFile = destFile;
		
	}

	private boolean isExist(String fileName) {
		
		File file = new File(fileName);
		return file.exists();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(!isExist(sourceFile)) {
			System.out.println("File does not exist");
			return;
		}
		
		 		
		/*byte[] buffer = new byte[100];
		try (FileInputStream in = new FileInputStream(sourceFile)) {
			
			try (FileOutputStream out = new FileOutputStream(destFile) ) {
		
				int len = in.read(buffer);
				while(len > 0) {
					//write all bytes from buffer
					//buffer size is 100 but it may contain less
					out.write(buffer,0,len);
					len = in.read(buffer);
				}
				out.flush();
				
			}catch (IOException io) {
				System.out.println("Error : "+io.getMessage());
			}
			
		}catch (IOException ioe) {
			System.out.println("Error: "+ioe.getMessage());
		}*/
		
		try {
		Files.copy(Paths.get(sourceFile), Paths.get(destFile), 
				StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copy completed!");
		} catch (IOException ioe) {
			System.out.println("Error: "+ioe.getMessage());
		}
	}

}
