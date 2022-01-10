package com.basic;

public class TestMethods {
	public static void main(String[] args) {
		test();
		System.out.println("------------------");
		user("Alexandar");
		System.out.println("---------------");
		int r = add(10, 20);
		System.out.println("Result = "+r);
		int mulBy10 = r * 10;
		System.out.println("Result after * 10: "+mulBy10);
		String str = Utility.hello(45);
		System.out.println("Str = "+str);
		Utility.demo();
	}
	public static void test() {
		System.out.println("test() is called");
	}
	public static void user(String name) {
		System.out.println("user(String) is called");
		System.out.println("Hello: "+name);
	}
	public static int add(int x, int y) {
		System.out.println("add(int, int) is called");
		return (x + y);
	}
}
