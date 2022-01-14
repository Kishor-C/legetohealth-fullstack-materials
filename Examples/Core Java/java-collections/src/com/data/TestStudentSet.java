package com.data;

import java.util.HashSet;
import java.util.Set;

public class TestStudentSet {
	public static void main(String[] args) {
		Student s1 = new Student(50, "Alex");
		Student s2 = new Student(45, "Bruce");
		Student s3 = new Student(60, "Charles");
		Student s4 = new Student(45, "David");
		Student s5 = new Student(51, "Alex");
		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		System.out.println("Size: "+students.size());
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
