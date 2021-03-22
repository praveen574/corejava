package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListWithArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(5);
		list.add("praveen");
		list.add("naveen");
		list.add("pavan");
		list.add("balaji");
		list.add("khan");
//		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("praveen");
		list2.add("naveen");
		list2.add("pavan");
		list2.add("balaji");
		list2.add("khan");
//		System.out.println(list2);

		List<String> list3 = new ArrayList<>();
//		list3.addAll(list2);
		list3.addAll(list);
		System.out.println(list3);

	}

}
