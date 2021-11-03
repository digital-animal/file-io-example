package com.zahid.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("src/main/resources/test.txt")
		) {
			// # using for loop & readAllBytes()
			byte[] b = fis.readAllBytes();
			for(byte x: b) {
				System.out.print((char)x);
			}
			System.out.println();
			
			// # using byte array constructor & string constructor
			// byte[] b = new byte[fis.available()]; // 
			// fis.read(b);
			
			String str = new String(b);
			System.out.println(str);

		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} catch (IOException e) {
			System.out.println(e);

		}
 
	}

}
