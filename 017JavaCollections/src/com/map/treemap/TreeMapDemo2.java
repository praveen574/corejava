package com.map.treemap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<String, String> serverExceptions = new TreeMap<>();
		serverExceptions.put("200", "ok");// one entry
		serverExceptions.put("500", "Internal server error");
		serverExceptions.put("300", "Bad request");
		serverExceptions.put("404", "page not found exception");
		System.out.println(serverExceptions);
		Set<String> keys = serverExceptions.keySet();
		for (String se : keys) {
			System.out.println("velues:" + se + " keys:" + serverExceptions.get(se));
		}
	}
}
