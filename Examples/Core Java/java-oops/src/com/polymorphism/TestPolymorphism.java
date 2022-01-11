package com.polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		A a = new A();
		print(a);
		B b = new B();
		print(b);
		C c = new C();
		print(c);
	}

	public static void print(A a1) {
		a1.display(); // calls display() method if its overridden
	}
}
