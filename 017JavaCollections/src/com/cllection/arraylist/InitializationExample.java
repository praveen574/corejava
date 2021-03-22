package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InitializationExample {
	public static void main(String args[]) {
//		ArrayList<String> obj = new ArrayList<String>();
//		// initializing using arrays.aslist
//
//		Arrays.asList("Pratap", "Peter", "Harsh");
//		System.out.println("Elements are:" + obj);
//		
		// by annonymous inner classes
		
		 ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
			   System.out.println(cities);
			   
			   //by coolection.n copies
			   ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
				  System.out.println("ArrayList items: "+intlist);
			   
	}

}
