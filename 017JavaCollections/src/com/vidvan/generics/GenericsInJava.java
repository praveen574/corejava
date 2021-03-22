package com.vidvan.generics;

public class GenericsInJava {
	public static void main(String[] args) {
		GenericSubClass<String>str=new GenericSubClass<String>("praveen");
		System.out.println(str.t);
	}

}
