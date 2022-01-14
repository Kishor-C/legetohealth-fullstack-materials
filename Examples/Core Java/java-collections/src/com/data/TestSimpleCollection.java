package com.data;

import java.util.HashSet;
import java.util.Set;

public class TestSimpleCollection {

	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(30);
		integerSet.add(10);
		integerSet.add(50);
		integerSet.add(20);
		integerSet.add(10);
		System.out.println("Size: "+integerSet.size());
		for(int num : integerSet) {
			System.out.println(num);
		}
	}

}
