package com.collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//natural sorting order
		TreeSet<Object>treeset=new TreeSet<>();
		
		treeset.add("string");
		treeset.add("xyz");
		treeset.add("abc");
//		treeset.add(10);//class cast exception

		System.out.println(treeset);
		
	}

}
