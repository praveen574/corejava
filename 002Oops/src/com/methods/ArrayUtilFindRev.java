package com.methods;

public class ArrayUtilFindRev {
	public int[] findRev(int[] arr) {
		int revArr[] = new int[arr.length];

		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			revArr[j] = arr[i];
		}

		return revArr; 
	}

//	public void print(int[] revArr) {
//		// TODO Auto-generated method stub
		
	}


