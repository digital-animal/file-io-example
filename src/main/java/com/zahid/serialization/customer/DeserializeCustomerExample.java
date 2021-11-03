package com.zahid.serialization.customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class DeserializeCustomerExample {

	public static void main(String[] args) {
		Customer[] customerArray;

		try (
			FileInputStream fis = new FileInputStream("src/main/resources/customerinfo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Scanner sc = new Scanner(System.in);
		) {
			int n = ois.readInt();
			System.out.println("# total customers: " + n);
			
			customerArray = new Customer[n];
			
			for(int i=0; i<n; i++) {
				customerArray[i] = (Customer)ois.readObject();
			}
			
			// printing retrieved customer objects
			for(Customer customer: customerArray) {
				System.out.println(customer);
			}

			// searching for a particular customer
			System.out.println();
			System.out.print("# Enter a customer name> ");
			String name = sc.next();
			for(Customer customer: customerArray) {
				if(name.equalsIgnoreCase(customer.getName())) {
					System.out.println(customer);
				}
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
