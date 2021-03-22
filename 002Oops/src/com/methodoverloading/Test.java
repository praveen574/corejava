package com.methodoverloading;

public class Test {
	public static void main(String[] args) {
		System.out.println(Adder.add(12, 23));
		System.out.println(Adder.add(23, 45, 34));

		System.out.println(Adder2.add(23.4, 22.6));
		System.out.println(Adder2.add(12, 23));
	}
}
