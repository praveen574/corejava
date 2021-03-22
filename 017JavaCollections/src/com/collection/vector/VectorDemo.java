package com.collection.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Object> vec = new Vector<>(4);
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		System.out.println("size is:" + vec.size());
		System.out.println("default capacity:" + vec.capacity());
		System.out.println("Vector elements are: " + vec);
		vec.add("Cat");
		vec.add("Rat");
		vec.add("Deer");

		System.out.println("size after addition is:" + vec.size());
		System.out.println(" capacity after addition:" + vec.capacity());
		System.out.println("Vector elements are: " + vec);

		if (vec.contains("Cat")) {
			System.out.println("present in the list");
		} else {
			System.out.println("not present in the list");
		}
		System.out.println(vec.set(2, "snake"));
		System.out.println(vec);

		System.out.println();
//Get the first element  
		System.out.println("The first animal of the vector is = " + vec.firstElement());
//Get the last element  
		System.out.println("The last animal of the vector is = " + vec.lastElement());
	}

}
