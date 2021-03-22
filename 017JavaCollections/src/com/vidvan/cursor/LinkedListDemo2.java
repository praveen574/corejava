package com.vidvan.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(9);
		linkedList.add(10);
		System.out.println("before iteration: " + linkedList);
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
//			Integer i = listIterator.next();
//			if (i.equals(2)) {
				listIterator.add(1456);
				listIterator.remove();
				listIterator.set(789);

			System.out.println("After iteration: " +listIterator );
			}
		}

	}


