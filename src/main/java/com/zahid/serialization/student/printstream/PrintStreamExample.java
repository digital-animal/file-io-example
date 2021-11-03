package com.zahid.serialization.student.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.zahid.serialization.student.Student;


public class PrintStreamExample {
	// # # four writing data to file
	public static void main(String[] args) {
		
		try (
			FileOutputStream fos = new FileOutputStream("src/main/resources/pstream.txt");
			PrintStream ps = new PrintStream(fos);
		) {
			Student s1 = new Student(101, "Alex", "CSE");
			Student s2 = new Student(102, "Lee", "EEE");
			Student s3 = new Student(103, "Cooper", "ME");
			Student s4 = new Student(104, "David", "CE");
			Student s5 = new Student(105, "John", "CSE");
			
			Student[] studentArray = {s1, s2, s3, s4, s5};
			
			ps.println(studentArray.length);
			
			for(Student student: studentArray) {
				System.out.println(student);
				ps.println(student.getRoll());
				ps.println(student.getName());
				ps.println(student.getDept());
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
