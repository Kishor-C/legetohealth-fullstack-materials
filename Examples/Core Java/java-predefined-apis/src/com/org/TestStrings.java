package com.org;

public class TestStrings {
	public static void main(String[] args) {
		String s1 = "hello"; String s2 = "hello"; 
		String s3 = new String("hello"); String s4 = new String("hello"); 
		System.out.println("s1 == s2: "+(s1 == s2)); // true
		System.out.println("s1 equals s2: "+s1.equals(s2)); // true
		System.out.println("s3 == s4: "+(s3 == s4)); // false
		System.out.println("s1 == s3: "+(s1 == s3)); // false
		System.out.println("s1 equals s3: "+s1.equals(s3)); //true
		System.out.println(s1);
		s1.concat("123");
		System.out.println(s1);
		StringBuffer sb1 = new StringBuffer("test");
		StringBuffer sb2 = new StringBuffer("test");
		System.out.println("sb1 equals sb2: "+sb1.equals(sb2)); //false
		System.out.println(sb1+" "+sb2);
		sb1.append("123");
		System.out.println(sb1+" "+sb2);
	}
}
