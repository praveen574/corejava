package com.collection.treeset;

import java.util.Comparator;

public class MyStringBufferComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s1.compareTo(s2);
	}}
//
//	@Override
//	public int compare(StringBuffer o1, StringBuffer o2) {
//		String s1 = o1.toString();
//		String s2 = o2.toString();
//
//		return s1.compareTo(s2);
//	}
//}