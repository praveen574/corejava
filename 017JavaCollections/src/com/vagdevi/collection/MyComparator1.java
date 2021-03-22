package com.vagdevi.collection;

import java.util.Comparator;

public class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = o1.toString();
		String string2 = o2.toString();

		int i1 = string1.length();
		int i2 = string2.length();

		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;

		} else {
			return string1.compareTo(string2);
		}
	}

}
