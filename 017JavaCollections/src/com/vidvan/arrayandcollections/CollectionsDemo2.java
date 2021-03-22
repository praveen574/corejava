package com.vidvan.arrayandcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class CollectionsDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("P");
		list.add("X");
		list.add("A");
		list.add("B");
		list.add("T");
		list.add("D");
		System.out.println(list);
		Collections.addAll(list, "apple", "banana", "mango");
		System.out.println(list);
		// System.out.println(Collections.asLifoQueue((Deque<String>) list));
		Collection checkedList = Collections.checkedCollection(list, String.class);
		checkedList.add("naveen");

		System.out.println("Checked list content: " + checkedList);
		List<String> list2 = new ArrayList<String>();
		list2.add("hyd");
		list2.add("vizag");
		Collections.copy(list, list2);
		System.out.println(list);
		System.out.println(Collections.disjoint(list, list2));// returns false if two collections contain common
																// elements

		Collections.fill(list2, "filled data");
		System.out.println(list2);
		System.out.println(Collections.frequency(list2, "filled data"));
		System.out.println(Collections.indexOfSubList(list, list2));
		System.out.println(Collections.max(list));
		System.out.println(Collections.synchronizedList(list));

	}
}
