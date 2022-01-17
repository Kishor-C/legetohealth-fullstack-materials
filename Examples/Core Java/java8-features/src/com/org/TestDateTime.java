package com.org;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestDateTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("Month: "+date.getMonthValue());
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("Hour: "+time.getHour());
		// give date in yyyy-MM-dd format
		LocalDate ownDate = LocalDate.parse("1995-01-30");
		System.out.println(ownDate);
	}
}
