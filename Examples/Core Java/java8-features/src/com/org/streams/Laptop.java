package com.org.streams;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
	private String name;
	private double price;
	private int ramSize;
	public Laptop(String name, double price, int ramSize) {
		super();
		this.name = name;
		this.price = price;
		this.ramSize = ramSize;
	}
	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", ramSize=" + ramSize + "]";
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public static List<Laptop> getAllLaptops() {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("Lenovo", 45000, 4));
		laptops.add(new Laptop("Lenovo", 65000, 8));
		laptops.add(new Laptop("Lenovo", 25000, 2));
		laptops.add(new Laptop("Lenovo", 85000, 16));
		laptops.add(new Laptop("Lenovo", 125000, 32));
		laptops.add(new Laptop("Lenovo", 95000, 16));
		laptops.add(new Laptop("HP", 55000, 4));
		laptops.add(new Laptop("HP", 85000, 8));
		laptops.add(new Laptop("HP", 35000, 2));
		laptops.add(new Laptop("HP", 95000, 16));
		laptops.add(new Laptop("HP", 135000, 32));
		laptops.add(new Laptop("Dell", 75000, 8));
		laptops.add(new Laptop("Dell", 55000, 8));
		laptops.add(new Laptop("Dell", 85000, 16));
		laptops.add(new Laptop("Dell", 95000, 16));
		laptops.add(new Laptop("Dell", 105000, 16));
		return laptops;
	}
}
