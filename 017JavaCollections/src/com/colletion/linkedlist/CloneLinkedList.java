package com.colletion.linkedlist;

import java.util.LinkedList;

public class CloneLinkedList {
	public static void main(String[] args) {
		 LinkedList<String> linkedlist = new LinkedList<String>();
		 
		    // Add elements to LinkedList
		    linkedlist.add("Cobol");
		    linkedlist.add("JCL");
		    linkedlist.add("C++");
		    linkedlist.add("C#");
		    linkedlist.add("Java");
		    System.out.println("initial elements:"+linkedlist);
		    
			 LinkedList<String> linkedlist2 = new LinkedList<String>();
			 linkedlist2=(LinkedList) linkedlist.clone();
			 System.out.println("after cloning:"+linkedlist2);
			 

	}

}
