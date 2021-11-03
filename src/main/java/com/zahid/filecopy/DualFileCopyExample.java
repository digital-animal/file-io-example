package com.zahid.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class DualFileCopyExample {

	public static void main(String[] args) {
		try (
			FileInputStream fis1 = new FileInputStream("src/main/resources/input1.txt");
			FileInputStream fis2 = new FileInputStream("src/main/resources/input2.txt");
			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
			FileOutputStream fos = new FileOutputStream("src/main/resources/output.txt");
		) {
			
			byte[] text = sis.readAllBytes(); // reading file to byte array
			 
			String str = new String(text); // byte array to string conversion
			System.out.println(str);
			
			fos.write(text);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
