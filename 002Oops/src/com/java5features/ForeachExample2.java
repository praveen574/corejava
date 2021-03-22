package com.java5features;

import java.util.ArrayList;

public class ForeachExample2 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("praveen");
		list.add("naveen");
		list.add("pavan");
		for(String s:list) {
			System.out.println(s);
		}
	}

}
