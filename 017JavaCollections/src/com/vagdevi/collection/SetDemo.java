package com.vagdevi.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Object>s=new HashSet<>();
		s.add(2);
		s.add(4);
		s.add("praveen");
		s.add("naveen");
		s.add("2");
		s.add(null);
		s.add(null);
		System.out.println(s);
		Iterator<Object>itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
