package com.org.streams;

import java.util.List;
import java.util.stream.Collectors;

public class TestJava8Streams {
	public static void main(String[] args) {
		List<Laptop> laptops = Laptop.getAllLaptops();
		// filtering only the laptops having ram > 8
		List<Laptop> laptopsRamGt8 = laptops.stream()
				.filter(laptop -> laptop.getRamSize() > 8)
				.collect(Collectors.toList());
		printAtUI(laptopsRamGt8);
		
		// filtering laptops with ram > 8 and brand not having HP
		List<Laptop> laptopsGt8GBExceptHP = laptops.stream()
				.filter(laptop -> laptop.getRamSize() > 8)
				.filter(laptop -> !laptop.getName().equals("HP"))
				.collect(Collectors.toList());
		printAtUI(laptopsGt8GBExceptHP);
		
		// sorting all the laptops > 8 and not having HP based on price
		List<Laptop> sortedLaptops = laptopsGt8GBExceptHP.stream()
				.sorted((l1, l2) -> Double.compare(l1.getPrice(), l2.getPrice()))
				.collect(Collectors.toList());
		printAtUI(sortedLaptops);
	}
	public static void printAtUI(List<Laptop> list) {
		for(Laptop laptop : list) 
			System.out.println(laptop);
		System.out.println("-------------------");
	}
}
