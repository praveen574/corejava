package com.cllection.arraylist;

import java.util.ArrayList;

public class SubListExample {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

//Addition of elements in ArrayList
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");

		System.out.println("Original ArrayList Content: " + al);
		
	     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 5));
	     System.out.println(al2);
	     
	    
	}
}
