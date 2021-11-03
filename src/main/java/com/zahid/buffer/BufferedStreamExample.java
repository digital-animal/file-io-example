package com.zahid.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStreamExample {

	public static void main(String[] args) throws IOException {
		// ## FileInputStream & BufferedInputStream
		try (
			FileInputStream fis = new FileInputStream("src/main/resources/test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);

			// or just one liner
			// BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/test.txt"));
		) {
			byte[] b = bis.readAllBytes(); // reading as byte array
			String str = new String(b); // converting to string
			System.out.println(str);
			
			System.out.println("# fis: " + fis.markSupported());
			System.out.println("# bis: " + bis.markSupported());
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
