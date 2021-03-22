package com.java5features;

public class ForeachExample1 {
	public static void main(String[] args) {
		int arr[] = { 23, 34, 56, 78, 12 };
		int total=0;
		
		for (int i : arr) {
			total=total+i;
		
			System.out.println(i);
			
	}
		System.out.println("total="+total);
	}

}
