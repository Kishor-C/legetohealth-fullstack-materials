package com.org.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStreams {
	public static void main(String[] args) {
		// get only the laptops with some conditions & then filter further
		List<Laptop> laptops = Laptop.getAllLaptops();
		List<Laptop> laptopsRamGt8 = new ArrayList<Laptop>();
		for(Laptop laptop : laptops) {
			if(laptop.getRamSize() > 8) {
				laptopsRamGt8.add(laptop);
			}
		}
		printAtUI(laptopsRamGt8);
		List<Laptop> laptopsGt8GBExceptHP = new ArrayList<Laptop>();
		for(Laptop laptop : laptopsRamGt8) {
			if(!laptop.getName().equals("HP")) {
				laptopsGt8GBExceptHP.add(laptop);
			}
		}
		printAtUI(laptopsGt8GBExceptHP);
		Collections.sort(laptopsGt8GBExceptHP, new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				return Double.compare(l1.getPrice(), l2.getPrice());
			}
		});
		printAtUI(laptopsGt8GBExceptHP);
	}
	public static void printAtUI(List<Laptop> list) {
		for(Laptop laptop : list) 
			System.out.println(laptop);
		System.out.println("-------------------");
	}
}
