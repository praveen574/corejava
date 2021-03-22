package com.cllection.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		//using generics we are providing type safty
		ArrayList<String>colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("pink");
		colors.add("yellow");
		
		System.out.println(colors);
		
		

}}
