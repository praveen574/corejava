package com.map.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestStudent {
	public static void main(String[] args) {
		//TreeMap<Student, Integer> students = new TreeMap<>(new MySnameComparator());
		TreeMap<Student, Integer> students = new TreeMap<>(new MySidComparator());

		Student s1 = new Student(1000, "dhiraaj", 15000.0);

		Student s2 = new Student(1001, "raju", 15000.0);
		Student s3 = new Student(1003, "suresh", 30000.0);

		Student s4 = new Student(1004, "vani", 15000.0);
		Student s5 = new Student(1005, "praveen", 15000.0);

		students.put(s2, 102);
		students.put(s1, 101);
		students.put(s3, 103);
		students.put(s5, 105);
		students.put(s4, 104);

		// TreeMap<Student, Course> students = new TreeMap<>();
//		students.put(s1, c1);
//		students.put(s4, c2);
//		students.put(s2, c1);
//		students.put(s3, c2);
//		students.put(s5, c2);
for(Entry<Student, Integer>map:students.entrySet()) {
	
	System.out.println(map);
}
	}
}