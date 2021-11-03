package com.zahid.serialization.student.datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.zahid.serialization.student.Student;

public class DataInputStreamExample {
	// # # reading file using DataInputStream
	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("src/main/resources/dstream.txt");
			DataInputStream dis = new DataInputStream(fis); 
		) {
			Student s1 = new Student();
			Student s2 = new Student();
			Student s3 = new Student();
			Student s4 = new Student();
			Student s5 = new Student();
			
			Student[] studentArray = {s1, s2, s3, s4, s5};
			
			int n = dis.readInt();
		
			for(Student student: studentArray ) {
				student.setRoll(dis.readInt());
				student.setName(dis.readUTF());
				student.setDept(dis.readUTF());
			}
			
			// printing retrieved objects	
			System.out.println("# total students: " + n);
			for(Student student: studentArray ) {
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
