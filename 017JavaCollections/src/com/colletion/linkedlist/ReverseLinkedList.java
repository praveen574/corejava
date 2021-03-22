package com.colletion.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		// Traversing the list of elements in reverse order
		Iterator<String> it = ll.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
