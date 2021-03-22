package com.vagdevi.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
	List<Object>l=new LinkedList<>();
	l.add(12);
	l.add(13);
	l.add("praveen");
	l.add("naveen");
	l.add("nani");
	l.add(4, "nnn");
	l.set(3, "venu");
	System.out.println(l);
	

List l2=new LinkedList();
	l2.add("praveen");
	l2.add("naveen");
	l2.add("sekhar");
	l2.add("manu");
	Collections.sort(l2);
	System.out.println(l2);
	
	Iterator itr = l2.iterator();
	while (itr.hasNext()){
		
		
			Object s=itr.next();
		
System.out.println(s);
	}
	}
	
	
	

}
