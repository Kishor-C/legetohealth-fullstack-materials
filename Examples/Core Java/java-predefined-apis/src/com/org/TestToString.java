package com.org;

import java.util.Date;

public class TestToString {
	public static void main(String[] args) {
		User u1 = new User("Alex", 35);
		User u2 = new User("Bruce", 44);
		System.out.println(u1); // u1.toString()
		System.out.println(u2); // u2.toString()
		String s1 = new String("test");
		String s2 = "hello";
		System.out.println(s1); //s1.toString()
		System.out.println(s2); //s2.toString()
		Date date = new Date();
		System.out.println(date); //date.toString()
	}
}
