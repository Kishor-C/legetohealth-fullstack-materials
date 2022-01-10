package com.basic;

public class TestConditions {
	public static void main(String[] args) {
		int marks = 51;
		if(marks >= 70) {
			System.out.println("First class with distinction: A+");
		}
		else if(marks < 70 && marks >= 60) {
			System.out.println("First class: A");
		}
		else if(marks < 60 && marks >= 50) {
			System.out.println("Second class: B");
		}
		else if(marks > 50 && marks <= 40) {
			System.out.println("Just pass: C");
		}
		else {
			System.out.println("Failed");
		}
		String grade = "C";
		switch(grade) {
		case "A+": System.out.println("First class with distinction");
		break;
		case "A": System.out.println("First class");
		break;
		case "B": System.out.println("Second class");
		break;
		case "C": System.out.println("Just pass");
		break;
		default: 
			System.out.println("Failed");
		}
	}
}
