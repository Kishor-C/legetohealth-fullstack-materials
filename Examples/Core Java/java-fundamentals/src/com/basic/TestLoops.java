package com.basic;

public class TestLoops {
	public static void main(String[] args) {
		int counter = 10;
		while(counter <= 5) {
			System.out.println("While loop Counter: "+counter);
			counter++;
		}
		int anotherCounter = 10;
		do {
			System.out.println("Do while loop Counter: "+anotherCounter);
			anotherCounter++;
		} while(anotherCounter <= 5);
	}
}
