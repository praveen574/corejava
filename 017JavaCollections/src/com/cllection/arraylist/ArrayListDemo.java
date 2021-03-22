package com.cllection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		System.out.println();
		arraylist.add(10);
		arraylist.add(23.45);
		arraylist.add("praveen");
		arraylist.add(43.66f);
		arraylist.add('d');
		arraylist.add('d');
		
		
//		System.out.println(arraylist);
		System.out.println(arraylist.size());
		arraylist.add(2, 23.44);
		System.out.println(arraylist);
// creating element
		arraylist.set(4, "naveen");
		System.out.println(arraylist);
		
		

		

	}

}
