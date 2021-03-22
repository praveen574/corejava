package com.collection.treeset;

import java.util.Comparator;

public class MyComparator2 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSid()>o2.getSid())
			return 1;
		if(o1.getSid()<o2.getSid())
			return -1;
		
		return 0;
	}
	

}
