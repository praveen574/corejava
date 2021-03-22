package com.collection.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VextorEnumeration {
	public static void main(String[] args) {
		 Vector<String> vector = new Vector<String>();
		 
		    
		    vector.add("Chaitanya");
		    vector.add("Shubham");
		    vector.add("Apoorv");
		    vector.add("Jin");
		    vector.add("Jacob");

			System.out.println("before vector iteration: " + vector);
	// if you want to iterate the collection object one by one we go for enumeration
			Enumeration<String> en = vector.elements();
		while (en.hasMoreElements()) {
				System.out.println(en.nextElement());
				
		    
	}

}}
