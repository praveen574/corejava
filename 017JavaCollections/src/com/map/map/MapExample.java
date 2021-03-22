package com.map.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		System.out.println(map);
		  //Traversing Map  
		Set set=map.entrySet();//Converting to Set so that we can traverse  
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
		Map.Entry entry=(Entry) itr.next();
		System.out.println(entry.getValue()+"  "+entry.getKey());
		}
	}

}
