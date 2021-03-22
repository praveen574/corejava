package com.collection.hashset;

import java.util.HashSet;

public class HashSetDemo4 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("HashSet contains: " + set);
		String[] array = new String[set.size()];
		set.toArray(array);
		System.out.println("Array elements: ");
		for (String temp : array) {
			System.out.println(temp);
		}

	}
}
