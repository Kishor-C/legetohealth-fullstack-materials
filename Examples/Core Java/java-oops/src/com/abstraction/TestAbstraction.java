package com.abstraction;
interface Vehicle {
	void mileage();
	void wheels();
}
abstract class Bike implements Vehicle {
	public void wheels() {
		System.out.println("Bike has 2 wheels");
	}
}
class Pulsar extends Bike {
	public void mileage() {
		System.out.println("Pulsar milage is 35kpl");
	}
}
class Ktm extends Bike {
	public void mileage() {
		System.out.println("Ktm milage is 32kpl");
	}
}
public class TestAbstraction {
	public static void main(String[] args) {
		Pulsar p = new Pulsar();
		Ktm k = new Ktm();
		ui(p);
		ui(k);
	}
	public static void ui(Vehicle v) {
		v.mileage();
		v.wheels();
		System.out.println("-----------------");
	}
}
