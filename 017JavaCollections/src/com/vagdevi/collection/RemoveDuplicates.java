package com.vagdevi.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> emplist = new ArrayList<>();
		emplist.add(2);
		emplist.add(4);
		emplist.add(3);
		emplist.add(6);
		emplist.add(2);
		emplist.add(6);
		emplist.add(3);
		emplist.add(5);

		System.out.println(emplist);
		List<Integer> newlist = new ArrayList<>();
		for (Integer emp : emplist) {
			if (!newlist.contains(emplist)) {
				newlist.add(emp);

			}

		}
		for (Integer al : newlist) {
			System.out.println(al);

		}

	}
}
