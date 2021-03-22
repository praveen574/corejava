package com.vidvan.generics;

public class GenericMethod {
	public static <E> void printType(E e){
		System.out.println(e.getClass().getTypeName());
	}
	public static void main(String[] args) {
		printType(245);
		printType(24.0);
		printType("praveen");

	}
	}
		