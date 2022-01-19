package com.org;

public class Shared implements Runnable{
	
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered the run()");
		for(int i = 1; i <= 10; i++) {
			
			try {
				System.out.println(name+": "+i+" iterated");
				Thread.sleep(1000);
				if(name.equals("A") && i == 5) {
					wait();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		notifyAll();
		System.out.println(name+" exits from the run()");
	}
}
