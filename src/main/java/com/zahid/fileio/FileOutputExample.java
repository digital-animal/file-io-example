package com.zahid.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args) {
		
		try (
			FileOutputStream fos = new FileOutputStream("src/main/resources/test.txt")
		) {
			String str = "Learn Java Programming";
			fos.write(str.getBytes()); 

			// byte[] b = str.getBytes();
			// fos.write(b);  // writing full byte array
			
			// for(byte x:b)
			// 	fos.write(x); // writing one byte at a time

			// fos.write(b, 6, 4); // writing byte array with offset
			// fos.write(b, 6, str.length()-6);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
