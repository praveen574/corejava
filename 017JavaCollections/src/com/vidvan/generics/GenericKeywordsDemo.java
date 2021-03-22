package com.vidvan.generics;

import java.util.ArrayList;

public class GenericKeywordsDemo {
	public static void main(String[] args) {
		GenericKeywordsDemo demo=new GenericKeywordsDemo();
		
	}
	public void Method1(ArrayList<String>list) {
		list.add(null);
		list.add("praveen");
		//IT WILL add null and string values
		//list.add(new Sample());
		
	}
	public void Method2(ArrayList<?>list) {
		list.add(null);
	//	it will add only null values
		//list.add("praveen");
		
	}
	public void Method3(ArrayList<? extends Parent>list) {
		list.add(null);
		//list.add(new Parent());
		//list.add(new Child());
		//list.add("");
		
		
	}
	public void Method4(ArrayList<? super Child>list) {
		list.add(null);
		//list.add(new Parent());
		list.add(new Child());
		//list.add("");
	}
	public void Method5(ArrayList<? super Runnable>list) {
		list.add(null);
		list.add(new Thread());
		//list.add(new Child());

		
	}


}
