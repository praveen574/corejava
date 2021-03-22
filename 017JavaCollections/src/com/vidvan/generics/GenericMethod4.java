package com.vidvan.generics;

import java.util.ArrayList;

public class GenericMethod4 {
	public static void main(String[] args) {
		Integer[]integers= {1,2,3,4,5};
		ArrayList<Integer>ai=new ArrayList<>();
		for (Integer integer : ai) {
			ai.add(23);
			System.out.println("integerlist contains:"+ai);
			
		}
	}

}
