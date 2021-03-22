package com.vidvan.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		arrayList.add(10);
		System.out.println("before iteration: " + arrayList);
		// it will support only legacy classes, not a universal cursor
		// Enumeration< Integer> en=arrayList.ele
		Iterator<Integer> itr = arrayList.iterator();
		while (itr.hasNext()) {
			//System.out.println(itr.next());
			Integer i = itr.next();
//			if (i.equals(2)) {
//				itr.remove();
//			}
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				itr.remove();
			}
			}
		System.out.println("\nAfter iteration: " +arrayList);
		
//		List<Integer> threadOne = new CopyOnWriteArrayList<>();
////		LinkedList<Integer>threadOne=new LinkedList<>();
//		threadOne.add(1);
//		threadOne.add(2);
//		threadOne.add(3);
//		threadOne.add(4);
//		threadOne.add(5);
//		threadOne.add(6);
//		threadOne.add(7);
//		threadOne.add(8);
//		threadOne.add(9);
//		threadOne.add(10);
//		System.out.println("before iteration: " + threadOne);
//		Iterator<Integer> threadTwo = threadOne.iterator();
//		while (threadTwo.hasNext()) {
//			System.out.println(threadTwo.next());
//			threadOne.add(225);
//		}
//		System.out.println("after iteration: " + threadOne);
//
	}
}
