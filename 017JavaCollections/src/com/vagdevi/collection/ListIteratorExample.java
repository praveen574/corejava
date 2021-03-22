package com.vagdevi.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List <String>l=new ArrayList<>();
		l.add("praveen");
		l.add("naveen");
		l.add("monu");
		System.out.println(l);
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		}
	}
	


