package com.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "dhiraaj", 15000.0);
		Course c1 = new Course("Java lang", 6);
		Student s2 = new Student(1001, "raju", 15000.0);
		Student s3 = new Student(1003, "suresh", 30000.0);
		Course c2 = new Course("IOs lang", 8);
		Student s4 = new Student(1004, "vani", 15000.0);
		Student s5 = new Student(1000, "dhiraaj", 15000.0);
		LinkedHashMap<Student, Course> students = new LinkedHashMap<>();
		students.put(s1, c1);
		students.put(s4, c2);
		students.put(s2, c1);
		students.put(s3, c2);
		students.put(s5, c2);
//for(Entry<Student, Course> details:students.entrySet()) {
//	System.out.println(details);
//}

		Set entrys = students.keySet();
		for (Object object : entrys) {
			System.out.println("Key: " + object +"   value: " + students.get(object));

		}

	}
}