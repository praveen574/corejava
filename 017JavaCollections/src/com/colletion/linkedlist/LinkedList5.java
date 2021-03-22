package com.colletion.linkedlist;

import java.util.LinkedList;

public class LinkedList5 {
	public static void main(String[] args) {
		 LinkedList<String> linkedlist = new LinkedList<String>();
		 
		    // Add elements to LinkedList
		    linkedlist.add("Cobol");
		    linkedlist.add("JCL");
		    linkedlist.add("C++");
		    linkedlist.add("C#");
		    linkedlist.add("Java");
		 
		    // Displaying Elements before replace
		    System.out.println("Before Replace:");
		    System.out.println(linkedlist);
		    
		    linkedlist.set(2, "oracle");
		    System.out.println(linkedlist);
		    
		 if(linkedlist.contains("Cobol")) {
			 System.out.println("element presesnt in the list");
			 
		 
		 }else {
			 System.out.println("element not presesnt in the list");

		 }
		    
	}

}
