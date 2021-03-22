package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopingTheArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(5);
		list.add("praveen");
		list.add("naveen");
		list.add("pavan");
		list.add("balaji");
		list.add("khan");
//		System.out.println(list);
		// with for loop;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		// with foreach;
		for (String s : list) {
			System.out.println(s);
		}
		// with while loop;

		int count = 0;
		while (list.size() > count) {
			System.out.println(list.get(count));
			count++;

			// with iteraror
			Iterator<String> itr = list.iterator();
			while (itr.hasNext());
				
			System.out.println(itr.hasNext());

		}
	}

}
