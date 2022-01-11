package com;
public class Table {
	// instance variables
	int rows;
	int cols;
	// static variable
	static int counter;
	// Instance Initialization Block: Called for every object creation
	{
		System.out.println("Table - IIB");
		counter++;
	}
	public Table() {
		rows = 1;
		cols = 1;
		System.out.println("Table() constructor");
	}
	public Table(int x, int y) {
		rows = x;
		cols = y;
		System.out.println("Table(int, int) constructor");
	}
	public void calculateCells() {
		int result = rows * cols;
		System.out.println("Result = "+result);
	}
	public static void tableCount() {
		System.out.println("Number of objects: "+counter);
	}
}
