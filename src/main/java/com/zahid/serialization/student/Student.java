package com.zahid.serialization.student;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // default constructor must be there to implement Serializable class
@AllArgsConstructor
// implements serializable for using ObjectStream
public class Student implements Serializable {
	private int roll;
	private String name;
	private String dept;

	@Override
	public String toString() {
		return String.format("%s(%d, %s)", name, roll, dept);
	}
}
