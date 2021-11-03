package com.zahid.floating;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadFloatExample {

	public static void main(String[] args) {

		try (
			FileInputStream fis = new FileInputStream("src/main/resources/floatnumbers.txt");
			DataInputStream dis = new DataInputStream(fis);
		) {
			int n = dis.readInt();
			float[] numbers = new float[n];
			
			for(int i=0; i<n; i++) {
				numbers[i] = dis.readFloat();
			}
			System.out.println(Arrays.toString(numbers));
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
