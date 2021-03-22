package com.map.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDeMO {
	public static void main(String[] args) throws InterruptedException {
//		HashMap<User, String>hm=new HashMap<>();
//		User user=new User();
//		hm.put(user, "praveen");
//		System.out.println(hm);
//		user=null;
//		Thread.sleep(5000);
//		System.gc();
//		System.out.println(hm);	}

		WeakHashMap<User, String> weakMap = new WeakHashMap<>();
		User user = new User();
		weakMap.put(user, "anil");
		System.out.println(weakMap);
		user = null;
		Thread.sleep(5000);
		System.gc();
		System.out.println(weakMap);
	}
}
