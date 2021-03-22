package com.colletion.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String>al=new LinkedList<>();
		al.add("praveen");
		al.add("naveen");
		al.add("pavan");
		al.add("mahesh");
		al.add(null);
//		System.out.println(al);
		 Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

		
	}

}
