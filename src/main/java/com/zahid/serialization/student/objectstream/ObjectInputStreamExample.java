package com.zahid.serialization.student.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

import com.zahid.serialization.student.Student;

public class ObjectInputStreamExample {
	// # # retrieving object from file
	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("src/main/resources/ostream.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			int n = ois.readInt();
			Student[] studentList = new Student[n];

			System.out.println("# total students: " + n);

			int i = 0;
			while (i < n) {
				Student student = (Student) ois.readObject();
				studentList[i++] = student;
				System.out.println(student);
			}
			System.out.println();
			System.out.println(Arrays.toString(studentList));

		} catch (FileNotFoundException | ClassCastException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
