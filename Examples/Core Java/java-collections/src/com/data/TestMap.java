package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, List<Student>> map = new HashMap<String, List<Student>>();
		Student s1 = new Student(1, "Alex");
		Student s2 = new Student(2, "Charles");
		List<Student> fcd = new ArrayList<Student>();
		fcd.add(s1);
		fcd.add(s2);
		Student s3 = new Student(5, "David");
		Student s4 = new Student(7, "Edward");
		List<Student> fc = new ArrayList<Student>();
		fc.add(s3);
		fc.add(s4);
		map.put("FCD", fcd);
		map.put("FC", fc);
		
		System.out.println("---- View only FCD students ------");
		List<Student> list = map.get("FC");
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
