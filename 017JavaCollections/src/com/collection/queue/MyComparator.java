package com.collection.queue;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length()-o2.length();
	}

}
