package com.cllection.arraylist;

import java.util.ArrayList;

public class ArrayListInitialization {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();//initial capacity with 10;
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		al1.add("5");
		al1.add("6");
		al1.add("7");
		al1.add("8");
		al1.add("9");
		al1.add("10");
		al1.ensureCapacity(5);
		
		al1.add("11");
		al1.add("12");
		
		System.out.println(al1.size());


		ArrayList<String> al2=new ArrayList<>(50);//initial capacity with 50;
		System.out.println(al2.size());

		al2.add("1");
		al2.add("2");
		al2.add("3");
		al2.add("4");
		al2.add("5");
		al2.add("6");
		al2.add("7");
		al2.add("8");
		al2.add("9");
		al2.add("10");
		al2.trimToSize();
		System.out.println(al2.size());
		//array list inside array list;
		ArrayList<String> al3=new ArrayList<>(al2);
		System.out.println(al3);
		
	}
	

}
