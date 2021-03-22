package com.vagdevi.collection;

import java.util.HashSet;

public class HashsetDemo2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("venu");
		System.out.println(set);
		
		HashSet<String> set1=new HashSet<String>();  
		set1.add("Praveen");
		set1.add("Naveen");
		set1.add("Pavan");
		System.out.println(set1);
		set.addAll(set1);
		System.out.println(set);
		System.out.println(set.containsAll(set1));
		System.out.println(set.retainAll(set1));
		
		
		String[] array = new String[set.size()];
		set.toArray(array);
		System.out.println("Array elements: ");
		for (String temp : array) {
			System.out.println(temp);
		}

	}

}
