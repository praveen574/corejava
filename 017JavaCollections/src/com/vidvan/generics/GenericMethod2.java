package com.vidvan.generics;

import java.util.ArrayList;

public class GenericMethod2 {
	public static void method(ArrayList<?>al) {
		//al.add(null);
		//al.add(100);
//		System.out.println(al.get(34));
//		al.remove(23);
//		
	}
	
	public static void main(String[] args) {
		ArrayList<String>sal=new ArrayList<String>();
		sal.add("praveen");
		ArrayList<Integer>ial=new ArrayList<>();
		ial.add(3435);
		ArrayList<Double>dal=new ArrayList<>();
		dal.add(54.98);
		method(sal);
		method(ial);
		method(dal);

	}

}
