package com.zahid.csv.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private int id;
	private String name;
	private String age;
	private String sex;
	private String dept;
	private String email;
}