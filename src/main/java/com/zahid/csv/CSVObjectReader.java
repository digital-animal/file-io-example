package com.zahid.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.zahid.csv.student.Student;

public class CSVObjectReader {
	public static void main(String[] args) {
		String sourceFile = "src/main/resources/records.csv";

		String line;
		String[] row;

		int id;
		String name;
		String age;
		String sex;
		String dept;
		String email;

		Map<Integer, Student> studentMap = new HashMap<>();

		try (
			FileReader file = new FileReader(sourceFile);
			Scanner scanner = new Scanner(file);
		) {
			scanner.nextLine(); // skipping first line(header)
			while(scanner.hasNextLine()) {
				// System.out.println(scanner.nextLine());
				line = scanner.nextLine();
				row = line.split(",");
	
				id = Integer.parseInt(row[0]);
				name = row[1];
				age = row[2];
				sex = row[3];
				dept = row[4];
				email = row[5];
	
				studentMap.put(id, new Student(id, name, age, sex, dept, email));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} 

		System.out.println(studentMap);
	}
}