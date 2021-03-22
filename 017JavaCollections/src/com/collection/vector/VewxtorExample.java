package com.collection.vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VewxtorExample {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(4);
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.add("Rat");
		vec.add("Deer");

		Vector<String> vec2 = new Vector<String>();
		vec2.add("AA");
		vec2.add("AB");
		vec2.add("AC");
		vec2.add("AD");
		System.out.println("Vector vec before copy: " + vec);
		Collections.copy(vec, vec2);
		System.out.println("Vector vec after copy: " + vec);

		System.out.println("Vector elements before sorting: " + vec);
//System.out.println("sub list elements:"+vec.subList(2, 6));
		Collections.sort(vec);

		System.out.println("Vector elements after sorting: :");
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}
	}
}
