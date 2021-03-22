package com.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(100, "praveen");
		lhm.put(101, "pavan");
		lhm.put(107, "naveen");
		lhm.put(106, "khan");
		lhm.put(104, "krishna");
		for (Entry<Integer, String> details : lhm.entrySet()) {
			System.out.println("keys:" + details.getKey() + " values:" + details.getValue());
		}
		lhm.putIfAbsent(102, "deepak");
		System.out.println(lhm);
		System.out.println(lhm.containsKey(100));
		System.out.println(lhm.containsValue("deepak"));
		lhm.remove(101);
		System.out.println(lhm);
		lhm.replace(104, "krishna", "prakash");
		System.out.println(lhm);

	}
}
