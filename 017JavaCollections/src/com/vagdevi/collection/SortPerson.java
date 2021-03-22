package com.vagdevi.collection;

import java.util.TreeSet;

public class SortPerson {
	public static void main(String[] args) {
		
		TreeSet<Person>ts=new TreeSet<>(new MyComparator());
		ts.add(new Person("praveen", 29));
		ts.add(new Person("sandeep", 26));
		ts.add(new Person("pavan", 34));
		ts.add(new Person("naveen", 25));
		
		for (Person p : ts) {
			System.out.println(p);
			
		}

	}

}
