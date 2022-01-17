package com.org;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambdaExpression {
	public static void main(String[] args) {
		User u1 = new User(555, "Raj", LocalDate.parse("1998-10-22"));
		User u2 = new User(444, "Alex", LocalDate.parse("1988-10-22"));
		User u3 = new User(666, "Suraj", LocalDate.parse("2000-10-22"));
		User u4 = new User(222, "Vijay", LocalDate.parse("1991-10-22"));
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		print(list);
		Collections.sort(list, (ux, uy) -> ux.getName().compareTo(uy.getName()));
		print(list);
		Collections.sort(list, (ux, uy) -> ux.getDob().compareTo(uy.getDob()));
		print(list);
	}
	public static void print(List<User> list) {
		for(User u : list)
			System.out.println(u);
		System.out.println("---------------");
	}
}
