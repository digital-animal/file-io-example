package com.zahid.serialization.customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class SerializeCustomerExample {

	public static void main(String[] args) {
		try (
			FileOutputStream fos = new FileOutputStream("src/main/resources/customerinfo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			Customer c1 = new Customer("Anna", "123456");
			Customer c2 = new Customer("Alex", "112489");
			Customer c3 = new Customer("Hannah", "492357");
			Customer c4 = new Customer("Mary", "816049");
			Customer c5 = new Customer("Jane", "235710");
	
			Customer[] customers = {c1, c2, c3, c4, c5};
			int n = customers.length;
			
			oos.writeInt(n);
			for(Customer c: customers) {
				oos.writeObject(c);
			}
			
		} catch (FileNotFoundException | NotSerializableException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
