package com.cllection.arraylist;

import java.util.ArrayList;

public class ArrayListAddAllMethod {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("praveen");
		al.add("pavan");
		al.add("naveen");
		al.add("vishal");
		ArrayList<String> al2 = new ArrayList<String>(al);
		al2.add("pak ");
		al2.add("ind");
		al2.add("ban");
		al2.add("us");
		
		al.addAll(2, al2);
		System.out.println(al);
	}

}
