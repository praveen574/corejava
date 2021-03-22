package com.methods;

import java.util.Scanner;

public class ArrayUtil {
	public int[] addElements(int[] arr) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		return arr;

	}

	

	public void print(int[] arr) {
		for (int i: arr) {
			System.out.println(i+" ");
		}
			System.out.println();

		}



	public int findMin(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
