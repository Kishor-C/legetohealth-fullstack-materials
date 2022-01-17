package com.org;

interface X {
	void test1();
	default void test2() {
		System.out.println("test2() is default methods");
	}
	static void test3() {
		System.out.println("test3() is static in X");
	}
}
class Z implements X {
	public void test1() {
		System.out.println("test1() inside Z");
	}
}

public class TestJava8DefaultStatic {

	public static void main(String[] args) {
		X x = new Z();
		x.test1();
		x.test2();
		X.test3();
	}

}
