package com.vagdevi.collection;

import java.util.TreeSet;

public class Comparator1 {
	public static void main(String[] args) {
		
	TreeSet treeSet=new TreeSet<>(new MyComparator1());
	treeSet.add("A");
	treeSet.add(new StringBuffer("ABC"));
	treeSet.add(new StringBuffer("AA"));
	treeSet.add("XX");
	treeSet.add("ABCD");
	treeSet.add("A");
	System.out.println(treeSet);

	}
	

}
