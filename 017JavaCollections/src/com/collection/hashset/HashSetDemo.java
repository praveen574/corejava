package com.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>(16);
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		set.add("Three");// it will ignore the duplicate elements
		System.out.println(set);
		System.out.println(set.size());
		Iterator<Object> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
