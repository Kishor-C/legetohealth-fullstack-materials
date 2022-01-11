package com.basic;

public class TestMethodOverloading {
	public static void main(String[] args) {
		add(50); // add(int)
		System.out.println("------------");
		add(20, 30); // add(int, int)
		System.out.println("-----------------");
		add(20L, 30L); // add(long, long)
		System.out.println("-----------------");
		add(20L, 30); // add(long, int)
		System.out.println("---------------");
		add((byte)126, (byte)30); // add(byte byte) explicit type casting 
		System.out.println("--------------------");
		add(20.0, 30.0); // add(double, double)
		System.out.println("--------------");
		add(20.0F, 30.0F); // add(float, float)
		System.out.println("--------------");
		add(20.0F, 30.0); // add(double, double) auto type casting
		System.out.println("----------------");
		add(20, 30L); // add(long, long)
	}

	public static void add(int x) {
		System.out.println("add(int)");
	}
	public static void add(int x, int y) {
		System.out.println("add(int, int)");
	}
	public static void add(byte x, byte y) {
		System.out.println("add(byte, byte): "+x);
	}
	public static void add(long x, long y) {
		System.out.println("add(long, long)");
	}
	public static void add(long x, int y) {
		System.out.println("add(long, int)");
	}
	public static void add(float x, float y) {
		System.out.println("add(float, float)");
	}
	public static void add(double x, double y) {
		System.out.println("add(double, double)");
	}
}
