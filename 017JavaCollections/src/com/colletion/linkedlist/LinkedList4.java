package com.colletion.linkedlist;

import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Initial list of elements: " + ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Praveen");
		System.out.println("list of elements: " + ll);
		// Getting First element of the List
		Object firstElement = ll.getFirst();
		System.out.println("First Element is: " + firstElement);
		// Getting Last element of the List
Object lastElement=ll.getLast();
System.out.println("last Element is: " + lastElement);

//get(i) returns element present at index i
for(int i=0; i < ll.size(); i++){
  System.out.println("Element at index "+i+" is: "+ll.get(i));
  
  int firstIndex = ll.indexOf("Vijay");
  System.out.println("First Occurrence: " + firstIndex);

} 
}

	}


