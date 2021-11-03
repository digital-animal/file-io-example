package com.zahid.floating;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class WriteFloatExample {

	public static void main(String[] args) {
		
		float[] list = {4.9f, 2.3f, 5.7f, 8.1f, 6.0f};
		System.out.println(Arrays.toString(list));
		int n = list.length;
		
		try (
			FileOutputStream fos = new FileOutputStream("src/main/resources/floatnumbers.txt");
			DataOutputStream dos = new DataOutputStream(fos);
		) {
			dos.writeInt(n);
			for(float num: list) {
				dos.writeFloat(num);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
