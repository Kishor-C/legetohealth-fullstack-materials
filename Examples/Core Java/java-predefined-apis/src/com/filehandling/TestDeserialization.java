package com.filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("user.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			User u = (User) ois.readObject();
			System.out.println("Name = "+u.getName()+", Id = "+u.getUserId());
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
