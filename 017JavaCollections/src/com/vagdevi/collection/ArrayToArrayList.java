package com.vagdevi.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] array = { "praveen", "naveen", "r", "e" };
		List<String> l = Arrays.asList(array);
		System.out.println(l);
	}

}
