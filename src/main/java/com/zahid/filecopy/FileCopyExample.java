package com.zahid.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("src/main/resources/source.txt");
			FileOutputStream fos = new FileOutputStream("src/main/resources/destination.txt");
		) {
			byte[] text = fis.readAllBytes(); // reading file contexts to byte array
			
			String str = new String(text); // converting byte array to string
			System.out.println("# source content:");
			System.out.println(str);
			System.out.println();
			
			str = str.toLowerCase();
			System.out.println("# destination content:");
			System.out.println(str);
			
			byte[] convertedText = str.getBytes(); // converting string to byte array
			fos.write(convertedText);

		} catch (FileNotFoundException e) {
			System.out.println(e); 
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
