package com.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Contacts {
	public static void main(String[] args) {
		LinkedHashMap<String, String> contacts1 = new LinkedHashMap<>();//default capacity 16
		contacts1.put("934578915", "Aravindh");
		contacts1.put("115646546", "yuvi");
		contacts1.put("9156465465", "dev");
		contacts1.put("44458746486", "balaji");
		System.out.println(contacts1);
		for(Entry<String, String>con:contacts1.entrySet()) {
			System.out.println(con.getKey()+" : "+con.getValue());

}}}


