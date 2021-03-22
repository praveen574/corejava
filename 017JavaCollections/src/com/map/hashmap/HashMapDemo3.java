package com.map.hashmap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo3 {
	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<>();
		System.out.println(hashmap.isEmpty());
		hashmap.put(100, "praveen");// one entry
		hashmap.put(101, "anil");// 2nd entry
		hashmap.put(103, "laxmi");
		hashmap.put(104, "sekhar");
		System.out.println(hashmap);

		// Set<String> keys=hashmap.keySet();
		for (Entry<Integer, String> key : hashmap.entrySet()) {
			System.out.println("keys:" + key.getKey() + ", values:" + key.getValue());

		}
		hashmap.putIfAbsent(105, "ramesh");
		System.out.println("After invoking putIfAbsent() method ");
		for (Entry<Integer, String> key : hashmap.entrySet()) {
			System.out.println("keys:" + key.getKey() + ", values:" + key.getValue());

		}
		HashMap<Integer, String> hashmap2 = new HashMap<>(hashmap);
		hashmap2.put(23, "mahesh");
		hashmap2.put(24, "nagesh");
		hashmap2.put(25, "varun");
		hashmap.putAll(hashmap2);
		//hashmap2.putAll(hashmap);
		System.out.println("After invoking putAll() method ");

		
		for (Entry<Integer, String> key : hashmap.entrySet()) {
			System.out.println("keys:" + key.getKey() + ", values:" + key.getValue());

		}
		hashmap.remove(101);
		System.out.println(hashmap);
		hashmap.remove(23, "mahesh");
		System.out.println(hashmap);
		hashmap.replace(100, "krishna");
		System.out.println(hashmap);
		hashmap.replace(103, "laxmi", "sai");
		System.out.println(hashmap);
		



	}
}