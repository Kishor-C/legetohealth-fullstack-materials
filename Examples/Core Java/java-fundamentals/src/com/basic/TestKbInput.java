package com.basic;

import java.util.Scanner;

public class TestKbInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an int");
		int num = scan.nextInt();
		System.out.println("Enter a double");
		double dbValue = scan.nextDouble();
		System.out.println("Enter a string");
		scan.nextLine(); // reads the enter key
		String str = scan.nextLine();
		// scanner opens the resource hence we need to close once taking all the input is complete
		System.out.println("Num = "+num+", DbValue = "+dbValue+", Str = "+str);
		scan.close();
	}
}
