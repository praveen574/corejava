package com.map.hashmap;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<>();
		System.out.println(hashmap.isEmpty());
		hashmap.put(1, "praveen");// one entry
		hashmap.put(2, "anil");// 2nd entry
		hashmap.put(3, "laxmi");
		hashmap.put(4, "sekhar");
		System.out.println(hashmap);
		Set<Entry<Integer, String>> keys = hashmap.entrySet();// returns key values
		System.out.println("Entries:" + keys);
		Set<Integer> ke = hashmap.keySet();// return key values
		System.out.println("keys:" + ke);

		Collection<String> values = hashmap.values();// returns values
		System.out.println("values:" + values);

		System.out.println("looping hashmap");

		for (Entry<Integer, String> key : hashmap.entrySet()) {
			System.out.println("keys:" + key.getKey() + "values:" + key.getValue());

		}

		System.out.println("While looping");
		Iterator<Entry<Integer, String>> itr = keys.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
