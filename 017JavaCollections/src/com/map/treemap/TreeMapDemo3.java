package com.map.treemap;

import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		TreeMap<Integer, String>tm=new TreeMap<>(new MyComparator());
		tm.put(100, "praveen");
		tm.put(101, "pavan");
		tm.put(105, "naveen");
		tm.put(104, "sekhar");
		System.out.println(tm);
		
	}

}
