package com.readcsv;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.*;
import java.nio.channels.FileChannel;


public class NIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile file = new RandomAccessFile("D:\\data.csv", "r");
		FileChannel fileChannel = file.getChannel();
		ByteBuffer bf = ByteBuffer.allocate(512);
		while(fileChannel.read(bf) > 0) {
			bf.flip();
			while(bf.hasRemaining()) {
				System.out.print((char)bf.get());
			}
			bf.clear();
		}
		file.close();
	}

}
