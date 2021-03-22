package com.vidvan.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {
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
		Enumeration<Integer> en = vector.elements();
//		while(en.hasMoreElements()) {
//			Integer i=en.nextElement();
//			if(i%2==0) {
//				System.out.println(i+" ");
//				
//			}else {
//				vector.remove(i);
//			}
//			// it won't element the unused objects from the vector
//			System.out.println("\nAfter vector iteration: " + vector);
		while(en.hasMoreElements()) {
			Integer i=en.nextElement();
			if(i%2!=0) {
				System.out.println(i+" ");
			}
			
		}
		

}}
