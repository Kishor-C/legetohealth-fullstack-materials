package com.data;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestStudentsOrder {
	public static void main(String[] args) {
		Student s1 = new Student(50, "Charles");
		Student s2 = new Student(45, "Alex");
		Student s3 = new Student(60, "Bruce");
		Student s4 = new Student(40, "David");
		
		Comparator<Student> rollNoInAsc = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getRollNo() - o2.getRollNo();
			}
		};
		Comparator<Student> nameInAsc = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Set<Student> students = new TreeSet<Student>(nameInAsc);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
