package com.colletion.linkedlist;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harish");

		System.out.println("initial list of elements:" + ll);
		// Removing specific element from arraylist

		ll.remove("ravi");
		System.out.println("after removing specific element:" + ll);
		// Removing element on the basis of specific position
		ll.remove(3);
		System.out.println("after removing specific index:" + ll);

		ll.removeFirst();
		System.out.println("after removing remove first method:" + ll);

		ll.removeLast();
		System.out.println("after removing remove lastmethod:" + ll);

		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");
		// Adding new elements to arraylist
		ll.addAll(ll2);
		System.out.println("after adding 2nd object to 1st object:" + ll);
		// Removing all the new elements from arraylist
		ll.removeAll(ll2);
		System.out.println("After invoking removeAll() method: " + ll);
		ll.removeFirstOccurrence("Ajay");
		System.out.println(ll);

		ll.removeLastOccurrence("Harsh");
		System.out.println(ll);
//Removing all the elements available in the list       
		ll.clear();
		System.out.println("After invoking clear() method: " + ll);

	}

}
