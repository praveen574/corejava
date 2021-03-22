package com.vidvan.arrayandcollections;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		String[] name = new String[5];
		name[0] = "test4";
		name[2] = "test3";
		name[3] = "test2";
		name[1] = "test1";
		name[4] = "test5";
		System.out.println("before sorting ");

		for (String string : name) {
			System.out.println(string);
			
	}
		System.out.println("after sorting ");
		Arrays.sort(name);
		for (String string2 : name) {
			System.out.println(string2);
			
		}
		//converting Arrays to list
		List<String>list=Arrays.asList(name);
		System.out.println(list);
System.out.println(Arrays.binarySearch(name, "test5"));
		}

}
