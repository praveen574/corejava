package com.constructor.oops;

public class Derived extends Base {
	Derived() {
		super();
		System.out.println("No-argument constructor " + "of derived");
	}

	Derived(String name) {
		// invokes base class constructor 2
//		super(name);
		System.out.println("Calling parameterized " + "constructor of derived");
	}

	public static void main(String args[]) {
		// calls parameterized constructor 4
//		Derived obj = new Derived("test");
		Derived obj=new Derived();
	}
}