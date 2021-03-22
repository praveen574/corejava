package com.collection.navigableset;

import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
TreeSet<Integer>ts=new TreeSet<>();
ts.add(1000);
ts.add(2000);
ts.add(3000);
ts.add(4000);
ts.add(5000);
System.out.println(ts);
System.out.println(ts.ceiling(1500));//returns lowest element >=1500;
System.out.println(ts.higher(3000));//returns lowest >3000
System.out.println(ts.floor(2500));//returns highest element <=2500
System.out.println(ts.lower(4000));//returns highest element <4000
System.out.println(ts.pollFirst());
System.out.println(ts.pollLast());
System.out.println(ts.descendingSet());
	}

}
