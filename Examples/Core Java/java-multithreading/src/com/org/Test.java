package com.org;

public class Test implements Runnable {
	public void demo() {
		for(int i = 0; i <= 200; i++) {
			System.out.println("i = "+i+", thread name = "+Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		demo();		
	}
}
