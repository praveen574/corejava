package com.collection.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorConversion {
	public static void main(String[] args) {

		// Step1: Creating a Vector of String elements
		Vector<String> vector = new Vector<String>();

		// Step2: Populating Vector
		vector.add("Tim");
		vector.add("Rock");
		vector.add("Hulk");
		vector.add("Rick");
		vector.add("James");
		System.out.println("vector elements:");
		for (String vec : vector) {
			System.out.println(vec);

//			List<String> list = Collections.list(vector.elements());
//			System.out.println("List Elements :");
//
//			for (String str2 : list) {
//				System.out.println(str2);

//			// Converting Vector to ArrayList
//			ArrayList<String> al = new ArrayList<>(vector);
//			System.out.println("ArrayList Elements :");
//			for (String s : al) {
//				System.out.println(s);
			// Converting Vector to String Array
			String[] array = vector.toArray(new String[vector.size()]);
			System.out.println("String Array Elements :");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);

			}
//			}
		}
	}
}
