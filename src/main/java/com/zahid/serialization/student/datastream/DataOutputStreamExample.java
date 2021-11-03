package com.zahid.serialization.student.datastream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.zahid.serialization.student.Student;

public class DataOutputStreamExample {
	// # # writing file using DataOutputStream
	public static void main(String[] args) {
		try (
			FileOutputStream fos = new FileOutputStream("src/main/resources/dstream.txt");
			DataOutputStream dos = new DataOutputStream(fos); 
		) {
			Student s1 = new Student(101, "Alex", "CSE");
			Student s2 = new Student(102, "Lee", "EEE");
			Student s3 = new Student(103, "Cooper", "ME");
			Student s4 = new Student(104, "David", "CE");
			Student s5 = new Student(105, "John", "CSE");
			
			Student[] studentArray = {s1, s2, s3, s4, s5};
			
			int n = studentArray.length;
			
			dos.writeInt(n);
			for(Student student: studentArray ) {
				dos.writeInt(student.getRoll());
				dos.writeUTF(student.getName());
				dos.writeUTF(student.getDept());
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
