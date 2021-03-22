package com.map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String>im=new IdentityHashMap<>();
		Integer id1=new Integer(10);
		Integer id2=new Integer(10);
//it will compare == comparator and it will compare references
		im.put(1, "balaji");
		im.put(2, "mahesh");
		im.put(id1, "sonu");
		im.put(4, "praveen");
		im.put(id2, "ramesh");
		System.out.println(im);
		

	}

}
