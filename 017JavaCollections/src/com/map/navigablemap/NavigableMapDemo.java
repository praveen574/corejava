package com.map.navigablemap;

import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String>tm=new TreeMap<>();
		tm.put("B", "banana");
		tm.put("C", "cat");
		tm.put("D", "dog");
		tm.put("F", "fish");
		tm.put("A", "Aapple");
		tm.put("E", "eagle");
		System.out.println(tm);
		System.out.println(tm.ceilingKey("D"));
		System.out.println(tm.higherKey("C"));
		System.out.println(tm.floorKey("B"));
		System.out.println(tm.lowerKey("E"));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.descendingKeySet());
		System.out.println(tm);









	}

}
