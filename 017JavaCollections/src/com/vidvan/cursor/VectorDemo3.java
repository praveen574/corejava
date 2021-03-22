package com.vidvan.cursor;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		vector.addElement(5);
		vector.addElement(6);
		vector.addElement(7);
		vector.addElement(8);
		vector.addElement(9);
		vector.addElement(10);

		System.out.println("before vector iteration: " + vector);
		Iterator<Integer>itr=vector.iterator();
		//cursor will support read and remove operation from given collection object
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				
			}
			itr.remove();

		}
		System.out.println("\nAfter vector iteration: " + vector);

	}

	}
