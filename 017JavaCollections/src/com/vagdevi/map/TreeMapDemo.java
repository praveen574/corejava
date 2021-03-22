package com.vagdevi.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(100, "praveen");
		tm.put(101, "pavan");
		tm.put(105, "naveen");
		tm.put(104, "sekhar");
		// tm.put("xyz", "naresh");// keys should be homogenious

		// tm.put(null, "khan");//null pointer exception
		tm.put(102, null);
		tm.putIfAbsent(111, "vinay");

		System.out.println(tm);
		System.out.println(tm.containsKey(105));
		tm.remove(101);
		System.out.println(tm);
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.descendingMap());
		System.out.println(tm.tailMap(101));// returns greater or equal
		System.out.println(tm.headMap(104));// returns less or equal
		System.out.println(tm.subMap(102, 105));

	}

}
