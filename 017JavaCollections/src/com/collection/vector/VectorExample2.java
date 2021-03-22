package com.collection.vector;

import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("Harry");
		vector.add("Steve");
		vector.add("Vince");
		vector.add("David");
		vector.add("Matt");
		System.out.println("Vector elements before replacement:" + vector);
		vector.set(2, "praveen");
		System.out.println("Vector elements after replacement:" + vector);
		
		vector.setSize(10);
	     System.out.println("Vector elements: "+vector);
	     vector.setSize(4);
	     System.out.println("Vector elements: "+vector);



	}
}
