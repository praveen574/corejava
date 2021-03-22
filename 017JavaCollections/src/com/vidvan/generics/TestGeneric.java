package com.vidvan.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	public static void main(String[] args) {
		MyGeneric<String>g = new MyGeneric<String>("55");
//		myGeneric.display();
//
//		MyGeneric<String> s = new MyGeneric<>("PRAVEEN");
//		s.display();
//		MyGeneric<Integer> i = new MyGeneric<Integer>(145);
//		i.display();
		g.add("praveen");
	g.display();
		
//		int item=24;
//		Integer [] i= {24,45,665,45,24,24,66,76};
//		System.out.println(myGeneric.countAllOccurrences(i, item));
//		
//		
//List<String>list=new ArrayList<String>();
//list.add("naveen");

		
}

} 