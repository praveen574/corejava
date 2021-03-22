package com.vagdevi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Object>l=new ArrayList<>();
		l.add(12);
		l.add("praveen");
		l.add("naveen");
		l.add("nani");
		l.add(4, "nnn");
		l.set(3, "venu");
		l.add("praveen");
		
		List<Object>l2=new ArrayList<>();
		l2.add(22);
		l2.add('p');
		l2.add("karteek");
		l2.add("praveen");
		
		System.out.println(l2);
		
		System.out.println(l);
	System.out.println(l.contains("naveen"));
	System.out.println(l.equals(12));
	System.out.println(l.get(3));
	System.out.println(l.indexOf("nani"));
	System.out.println(l.hashCode());
	System.out.println(l.lastIndexOf("naveen"));
	System.out.println(l.remove("venu"));
	System.out.println(l.size());
	System.out.println(l.toString());
	System.out.println(l);

System.out.println(l.containsAll(l2));
System.out.println(l.addAll(l2));
System.out.println(l);
System.out.println(l.containsAll(l2));
System.out.println(l2.containsAll(l));

System.out.println(l.indexOf("praveen"));

System.out.println();

for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
	
	
}

for (Object o : l2) {
	System.out.println(o);
	
}


	}

}
