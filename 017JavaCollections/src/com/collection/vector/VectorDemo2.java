package com.collection.vector;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String args[]) {
		// Create an empty Vector
		Vector<Integer> in = new Vector<>();
		// Add elements in the vector
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(200);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);

		System.out.println("Values in vector: " + in);
in.remove(1);
System.out.println("after remove Values in vector: " + in);

System.out.println("integer present:"+in.contains(900));
System.out.println("index is:"+in.indexOf(300));
System.out.println("Remove first occourence of element 300: "+in.remove((Integer)300));  
System.out.println("Element at index 3 is = "+in.get(3));  


	}
}