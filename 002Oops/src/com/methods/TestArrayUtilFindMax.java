package com.methods;

public class TestArrayUtilFindMax {
	public static void main(String[] args) {
		ArrayUtilFindMax arrayUtil = new ArrayUtilFindMax();
		int arr[] = { 100, 200, 30, 4, 50 };
		int max = arrayUtil.findMax(arr);
		System.out.println("Max : " + max);
	}

}
