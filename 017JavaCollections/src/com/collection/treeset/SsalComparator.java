package com.collection.treeset;

import java.util.Comparator;

public class SsalComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getSfee() > o2.getSfee())
			return 1;
		if (o1.getSfee() < o2.getSfee())
			return -1;
		return 0;
	}

}
