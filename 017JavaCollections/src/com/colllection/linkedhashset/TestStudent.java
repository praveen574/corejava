package com.colllection.linkedhashset;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestStudent {
	public static void main(String[] args) {
		java.util.List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(2, "ram", 14000.0));
		studentList.add(new Student(2, "rakesh", 14000.0));
		studentList.add(new Student(3, "raju", 14000.0));
		studentList.add(new Student(1, "divya", 14000.0));
		studentList.add(new Student(2, "rakesh", 14000.0));
		studentList.add(new Student(3, "raju", 14000.0));

		System.out.println("list of students with list interface");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
//		System.out.println("set of students with set interface");
//		Set<Student> setOfStudents = new HashSet<>(studentList);
//		// we have to override hashcode and equalls method
//		Iterator<Student> itr = setOfStudents.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//
//		}
		System.out.println();
		System.out.println("linkedhashset with student ");

		Set<Student> linkedhashSet = new LinkedHashSet<>(studentList);
		Iterator<Student> itr2 = linkedhashSet.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}