package com.cllection.arraylist;

import java.util.ArrayList;

public class ArrayListWithMethods {
	public static void main(String[] args) {
		ArrayList<Object> javaCourse = new ArrayList<>();
		System.out.println(javaCourse.isEmpty());
		System.out.println(javaCourse.size());
		javaCourse.add("java");
		javaCourse.add("core java");
		javaCourse.add("Frame Works");
		System.out.println(javaCourse.isEmpty());
		System.out.println(javaCourse.size());
		System.out.println(javaCourse);
		if (javaCourse.contains("Frame Works")) {
			System.out.println("Frame Works Are: Hibernate, Spring, Springboot");

		} else {
			System.out.println("data is invalid");
		}
		// getting the 1 st index data
		System.out.println(javaCourse.get(1));
		// update the data
		javaCourse.add(1, "oracle data base");
		System.out.println(javaCourse);
		// finding the given index of given object
		System.out.println(javaCourse.indexOf("oracle data base"));
		javaCourse.remove(0);
		javaCourse.remove("Oracle Database");
		System.out.println(javaCourse);
		System.out.println("after calling the clear method");
		javaCourse.clear();
		System.out.println(javaCourse);
		System.out.println();

	}

}
