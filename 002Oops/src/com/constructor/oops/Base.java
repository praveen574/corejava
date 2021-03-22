package com.constructor.oops;

public class Base {
	String name;

	public Base() {
this(" ");
		System.out.println("No-argument constructor of" + " base class");
	}

	public Base(String name) {
		System.out.println("Calling parameterized constructor" + " of base");
	}

}
