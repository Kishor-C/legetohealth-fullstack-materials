package com.org.streams;

import java.util.List;

public class TestParallelStreams {

	public static void main(String[] args) {
		List<Laptop> list = Laptop.getAllLaptops();
		list.stream().filter(item -> item.getRamSize() > 8).forEach(item -> System.out.println(item+" => "+Thread.currentThread().getName()));
		System.out.println("------------------------");
		list.parallelStream().filter(item -> item.getRamSize() > 8).forEach(item -> System.out.println(item+" => "+Thread.currentThread().getName()));
	}

}
