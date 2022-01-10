package com.basic;

public class TestDatatypes {
	public static void main(String[] args) {
		// byte range is -128 to +127
		byte byteValue = 127; // 0111 1111
		int intValue = 1122;
		long longValue = 9900113344L;
		int charValue = 'A'; // stores 65
		// when int takes character it stores ascii value in it
		char charValue2 = 'B';
		// char can take int value, but it stores character having that 
		// ascii code
		char charValue3 = 98; // stores 'b'
		System.out.println("Byte Value: "+byteValue);
		System.out.println("Int Value: "+intValue);
		System.out.println("Long Value: "+longValue);
		System.out.println("Char Value: "+charValue);
		System.out.println("Char Value2: "+charValue2);
		System.out.println("Char Value3: "+charValue3);
	}
}
