package com.filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		try {
			User user = new User(1234, "Raj");
			System.out.println(user);
			FileOutputStream fos = new FileOutputStream("user.ser"); // extension need not .ser 
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(user); // writes user and upcasts to Object type
			fos.flush();
			fos.close();
			System.out.println("Object is serialized!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
