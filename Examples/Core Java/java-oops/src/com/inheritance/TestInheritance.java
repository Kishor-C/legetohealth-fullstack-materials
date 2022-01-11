package com.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Person p1 = new Person("Alex", "Male");
		p1.printInfo();
		System.out.println("-----------------------");
		Employee e1 = new Employee(100, "Bruce", "Male", 42000);
		e1.printInfo();
	}

}
