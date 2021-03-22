package com.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConstructors {
	public static void main(String[] args) {
		ArrayList<String>arraylist=new ArrayList<>();
		arraylist.add("praveen");
		arraylist.add("naveen");
		arraylist.add("praveen");
		arraylist.add("divakar");

		
			HashSet<String>set=new HashSet<>();//default capacity 16
			HashSet<String>set2=new HashSet<>(100);
			HashSet<String>set3=new HashSet<>(100,0.90f);
			HashSet<String>set4=new HashSet<>(arraylist);


			  set.add("One");    
	          set.add("Two");    
	          set.add("Three");   
	          set.add("Four");  
	          set.add("Five");
	          set.add("Three");//false
	          System.out.println(set);
	          System.out.println(set4);
	}

}
