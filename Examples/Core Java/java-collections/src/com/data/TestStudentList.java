package com.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudentList {
	public static void main(String[] args) {
		Student s1 = new Student(50, "Charles");
		Student s2 = new Student(45, "Alex");
		Student s3 = new Student(60, "Bruce");
		Student s4 = new Student(40, "David");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list); // calls Comparable.compareTo
		for(Student s : list) 
			System.out.println(s);
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getRollNo() - s2.getRollNo();
			}
		});
		System.out.println("---------------");
		for(Student s : list) 
			System.out.println(s);
	}
}
