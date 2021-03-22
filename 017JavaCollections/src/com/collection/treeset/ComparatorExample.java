package com.collection.treeset;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Object>ts=new TreeSet<>(new CompratorTest());
		ts.add(10);
		ts.add(56);
		ts.add(3);
		ts.add(76);
		System.out.println(ts);
	}

}
