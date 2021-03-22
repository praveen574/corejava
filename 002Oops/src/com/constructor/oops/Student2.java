package com.constructor.oops;

public class Student2 {
	int id;
	String name;
	int age;

	public Student2(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public Student2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

}
