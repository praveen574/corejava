package com.vidvan.arrayandcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("P");
		list.add("X");
		list.add("A");
		list.add("B");
		list.add("T");
		list.add("D");
		System.out.println(list);
		Collections.sort(list, new MyComparator());
		System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	System.out.println(Collections.binarySearch(list, "T"));
	System.out.println(Collections.binarySearch(list, "Z"));
	
//	Set<String> set = new HashSet<>();
//	set.add("P");
//	set.add("X");
//	set.add("A");
//	set.add("B");
//	System.out.println(set);
//	Collections.asLifoQueue((Deque<String>) set);
//
//
//
//	System.out.println(Collections.frequency(list, "X"));


}}
