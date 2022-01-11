package com;

public class TestEncapsulation {
	public static void main(String[] args) {
		User u1 = new User(100, "Alex", 35);
		User u2 = new User(200, "Bruce", 40);
		u1.printInfo();
		u2.printInfo();
		u1.setAge(38);
		u1.printInfo();
	}
}
