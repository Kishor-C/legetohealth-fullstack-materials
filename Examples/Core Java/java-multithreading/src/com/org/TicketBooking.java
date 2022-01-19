package com.org;

public class TicketBooking implements Runnable {
	private static int availableTicket = 1;
	public void run() {
		book();
	}
	public synchronized void book() {
		String name = Thread.currentThread().getName();
		System.out.println("Name: "+name+" Entered");
		if(availableTicket != 0) {
			System.out.println("Name: "+name+" got ticket");
			availableTicket--;
		} else {
			System.out.println("Name: "+name+" didn't get the ticket");
		}
	}
}
