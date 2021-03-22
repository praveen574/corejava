package com.collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		 
		Set<Student> treeset = new TreeSet<Student>(new SsalComparator());
		treeset.add(new Student(105, "test5", 14500.00));
		treeset.add(new Student(102, "test2", 10000.00));
		treeset.add(new Student(100, "test", 12500.00));
		treeset.add(new Student(101, "test1", 11000.00));
		treeset.add(new Student(103, "test3", 18000.00));
		treeset.add(new Student(104, "test4", 17000.00));
		for (Student student : treeset) {
			System.out.println(student);
		}
		

	}

}


