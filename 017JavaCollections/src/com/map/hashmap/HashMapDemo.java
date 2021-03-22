package com.map.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		System.out.println(hashmap.isEmpty());
		hashmap.put(1, "praveen");// one entry
		hashmap.put(2, "anil");// 2nd entry
		hashmap.put(3, "laxmi");
		hashmap.put(4, "sekhar");
		hashmap.put(null, "naveen");//null is possible 
		hashmap.put(7, null);


		// hashmap.put(2, "srikanth");
		hashmap.put(5, "praveen");// allows duplicate values
		System.out.println(hashmap.get(3));
	System.out.println(hashmap.containsKey(2));
	System.out.println(hashmap.containsValue("anil"));
	System.out.println(hashmap.size());
		System.out.println(hashmap.isEmpty());


		System.out.println(hashmap);
		HashMap<String, String> country = new HashMap<>();
		country.put("india", "ts");
		country.put("india", "ap");
		country.put("india", "mp");
		country.put("india", "mh");
		country.put("india", "wb");
		country.put("india", "hp");
		System.out.println(country);
	}

}
