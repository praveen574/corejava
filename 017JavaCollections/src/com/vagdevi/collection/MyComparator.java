package com.vagdevi.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o2.getName().compareTo(o1.getName());
		
//		if(o1.getAge()>o2.getAge()) 
//			return 1;
//			if(o1.getAge()<o2.getAge())
//				return -1;
//	
	//return 0;	
		
	}

}
