package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CopyListToArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("praveen");
		al.add("pavan");
		al.add("naveen");
		al.add("vishal");
		System.out.println(al);
		
		List<String>list=new ArrayList<>();
		list.add("ind");
		list.add("pak");
		list.add("aus");
		list.add("us");
		
		al.addAll(list);
		System.out.println(al);
		
		al.addAll(2,list);
		System.out.println("array list after adding list index ="+al);
		
		


	}

}
