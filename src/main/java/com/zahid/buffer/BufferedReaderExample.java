package com.zahid.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// ## FileReader & BufferedReader
		try (
			FileReader fr = new FileReader("src/main/resources/test.txt");
			BufferedReader br = new BufferedReader(fr);

			// or just one lines
			// BufferedReader br = new BufferedReader(new FileReader("src/maim/resources/test.txt"));
			
		) {	
			String str = br.readLine();
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
