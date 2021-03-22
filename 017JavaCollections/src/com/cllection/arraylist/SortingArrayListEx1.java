package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> country = new ArrayList<>();
		country.add("ind");
		country.add("pak");
		country.add("us");
		country.add("sa");
		country.add("nz");
		System.out.println("Before Sorting:");
		for (String counter : country) {
			System.out.println(counter);
		}

		Collections.sort(country);

		System.out.println("After Sorting:");
		for (String counter : country) {
			System.out.println(counter);
		}
	}
}