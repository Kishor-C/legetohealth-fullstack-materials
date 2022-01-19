package com.org;

public class TestThreads {

	public static void main(String[] args) {
		Shared target = new Shared();
		Thread t1 = new Thread(target, "A");
		Thread t2 = new Thread(target, "B");
		Thread t3 = new Thread(target, "C");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main thread ends");
	}

}
