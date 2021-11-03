package com.zahid.serialization.student.printstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zahid.serialization.student.Student;


public class BufferedReaderExample {
	// # # four reading file
	public static void main(String[] args) {
		
		try (
			FileInputStream fis = new FileInputStream("src/main/resources/pstream.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			// InputStreamReader converts Stream object to Reader object
			// InputStreamReader is a bridge class which connects Stream to Reader
		) {
			Student s1 = new Student();
			Student s2 = new Student();
			Student s3 = new Student();
			Student s4 = new Student();
			Student s5 = new Student();
			
			Student[] studentArray = {s1, s2, s3, s4, s5};
			
			int n = Integer.parseInt(br.readLine());
			
			for(Student student: studentArray) {
				student.setRoll(Integer.parseInt(br.readLine()));
				student.setName(br.readLine());
				student.setDept(br.readLine());
			}
			
			// printing objects retrieved
			System.out.println("# total students: " + n);
			for(Student student: studentArray) {
				System.out.println(student);
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
