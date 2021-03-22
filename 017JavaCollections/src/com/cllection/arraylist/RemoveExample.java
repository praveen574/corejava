package com.cllection.arraylist;

import java.util.ArrayList;

public class RemoveExample {
	public static void main(String args[]) {
		// String ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("AB");
		al.add("CD");
		al.add("EF");
		al.add("GH");
		al.add("AB");
		al.add("YZ");
		System.out.println("ArrayList before remove:");
		System.out.println(al);

		al.remove(2);
		al.remove(3);


		System.out.println("ArrayList before remove:");
		System.out.println(al);
		
		boolean b = al.remove("EF");
		System.out.println("Element EF removed: " + b);


	}
}