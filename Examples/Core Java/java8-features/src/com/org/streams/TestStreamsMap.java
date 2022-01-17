package com.org.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreamsMap {
	public static void main(String[] args) {
		List<Laptop> laptops = Laptop.getAllLaptops();
		Set<String> laptopNames = laptops.stream().map(laptop -> laptop.getName()).collect(Collectors.toSet());
		System.out.println(laptopNames);
		Set<Integer> laptopRamSize = laptops.stream().map(laptop -> laptop.getRamSize()).collect(Collectors.toSet());
		System.out.println(laptopRamSize);
	}
}
