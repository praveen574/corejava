package com.colletion.linkedlist;

import java.awt.List;
import java.util.LinkedList;

public class SubLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Initial list of elements: " + ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Praveen");
		System.out.println("list of elements: " + ll);
	 java.util.List<String> sublist= ll.subList(0, 3);
	 System.out.println(sublist);
	 
	 sublist.remove(2);
	 System.out.println(sublist);
	}

}
