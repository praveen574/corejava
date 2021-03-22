package com.vagdevi.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static <E> void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("pavan", 101);
		map.put("chiru", 103);
		map.put("mahesh", 104);
		map.put("naveen", 102);
		map.put("naveen", 109);

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("mahesh"));
		System.out.println(map.put("charan", 106));
		System.out.println(map);
		System.out.println(map.containsKey("dhoni"));
		System.out.println(map.equals(map));
		System.out.println(map.remove("naveen"));
		Set<java.util.Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<java.util.Map.Entry<String, Integer>> iterator = entryset.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
		System.out.println("__________");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
