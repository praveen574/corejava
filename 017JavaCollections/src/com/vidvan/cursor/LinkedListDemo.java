package com.vidvan.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
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
//			Integer i=listIterator.next();
//			if(i%2==0) {
//				System.out.println(i+" ");
//			}
			System.out.print(listIterator.next() + " ");
		}
		System.out.println("\niterating backward direction");

		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
	}

	}

}
