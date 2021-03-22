package com.vidvan.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);

		System.out.println("before vector iteration: " + vector);
		// if you want to iterate the collection object one by one we for enumeration
		Enumeration<Integer>en=vector.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
}
}