package com.zahid.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlingExample {

	public static void main(String[] args) {
		
		File f = new File("src/main/resources"); // file object => file or directory

		System.out.println("# content of resources directory:");
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		System.out.println(Arrays.toString(f.list()));
		String[] list = f.list(); // list simple file & directoy
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(f.listFiles()));
		
		File[] fileList = f.listFiles(); // list of files only, not directory
		for(File t:fileList) {
			// System.out.println(t);
			System.out.println(t.getName());
			// System.out.println(t.getPath());
			// System.out.println(t.getAbsolutePath());
			// System.out.println(t.getParent());
			// System.out.println(t.getParentFile());
		}
		System.out.println();
		
		System.out.println("# context of `data.txt`:");
		File file = new File("src/main/resources/data.txt"); // creating file
		// file.setReadOnly();
		file.setWritable(true);
		
		try (
			FileOutputStream fos = new FileOutputStream("src/main/resources/data.txt");
		) {
			String text = "once upon a time in the wild west";
			fos.write(text.getBytes());

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(file.length());
		System.out.println(file.isHidden());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getTotalSpace() / (1024*1024*1024) + "GB");
		System.out.println(file.getFreeSpace() / (1024*1024*1024) + "GB");
		System.out.println(file.getUsableSpace() / (1024*1024*1024) + "GB");
		System.out.println();
	}

}
