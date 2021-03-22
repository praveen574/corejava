package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(34);
		list.add(25);
		list.add(56);
		System.out.println("before sorting");
		for (int counter : list) {
			System.out.println(counter);
		}
		   Collections.sort(list, Collections.reverseOrder());
		 System.out.println("ArrayList in descending order:");
		   for(int dec: list){
				System.out.println(dec);
			}

		Collections.sort(list);
		

		System.out.println("After Sorting:");
		for (int counter : list) {
			System.out.println(counter);

			
		}
	}
}
