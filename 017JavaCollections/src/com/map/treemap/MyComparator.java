package com.map.treemap;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

//	@Override
//	public int compare(String o1, String o2) {
//		String s1=(String)o1;
//		String s2=(String)o2;
//
//		return s2.compareTo(s1);

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		return i2.compareTo(i1);

	}
}