package com.constructor.oops;

public class SetGetDemoPerson {

	private String name;
	private int age;
	private String favcolor;

	public void setName(String name) {
		this.name = name;

	}

	public String get(String name) {
		return name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int get(int age) {
		return age;
	}

	public void setFavcolor(String favcolor) {
		this.favcolor = favcolor;
	}
	public String get1(String favcolor) {
		return favcolor;
	}

	public void display() {
		System.out.println("name of the student=" + name);
		System.out.println(+age);
		System.out.println(favcolor);
	}
	
}
