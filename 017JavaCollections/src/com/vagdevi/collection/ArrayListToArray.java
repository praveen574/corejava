package com.vagdevi.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("praveen");
		list.add("naveen");
		list.add("sai");
		list.add(23);
		System.out.println(list);

		Object[] array = list.toArray();
		for (Object o : array) {
			System.out.println(o);
		}
	}

}
