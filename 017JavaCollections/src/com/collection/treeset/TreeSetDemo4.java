package com.collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String[] args) {
		//natural sorting order
//		TreeSet<StringBuffer>treeset=new TreeSet<>(new MyStringBufferComparator());
//		treeset.add(new StringBuffer("string"));
//		treeset.add(new StringBuffer("xyz"));
//		treeset.add(new StringBuffer("abc"));
//		System.out.println(treeset);
//	
		TreeSet<StringBuffer>treeset=new TreeSet<>(new MyStringBufferComparator());
		treeset.add(new StringBuffer("a"));
		treeset.add(new StringBuffer("c"));
		treeset.add(new StringBuffer("b"));
		treeset.add(new StringBuffer("g"));
		System.out.println(treeset);
	}


}
