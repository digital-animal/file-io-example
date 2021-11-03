package com.zahid.serialization.customer;

import java.io.Serializable;

import lombok.Data;

@Data
public class Customer implements Serializable {
	private String customerID;
	private String name;
	private String phoneNumber;
	
	private static int serial = 1;
	
	public Customer() {
		// pass
	}

	public Customer(String name, String phoneNumber) {
		this.customerID = Customer.generateID();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public static String generateID() {
		String newID = String.format("C%02d", serial);
		serial++;
		return newID;
	}
}
