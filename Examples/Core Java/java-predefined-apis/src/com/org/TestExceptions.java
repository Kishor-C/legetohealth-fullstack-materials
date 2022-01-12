package com.org;

import java.util.Scanner;
@SuppressWarnings("serial")
class AgeInvalidException extends Exception {
	AgeInvalidException() {
		super("Age is invalid!");
	}
	AgeInvalidException(String error) {
		super(error);
	}
}
public class TestExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (AgeInvalidException e) {
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		System.out.println("Last line of the program!");
	}
	public static void validateAge(int age) throws AgeInvalidException {
		if(age < 18 || age > 60) {
			throw new AgeInvalidException("Age "+age+" is invalid");
		} else {
			System.out.println("The age entered is :"+age);
		}
	}
	
}
