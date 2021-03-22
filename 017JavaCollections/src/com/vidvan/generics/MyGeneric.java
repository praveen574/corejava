package com.vidvan.generics;

public class MyGeneric <T> {
	
	private T t;
	public MyGeneric() {
		
	}
	public MyGeneric(T t) {
		
		this.t = t;
	}
	
	public void display() {
		System.out.println("class details"+t.getClass().getName());
	}
public void add(T t) {
	
	
}


public static <T> int countAllOccurrences(T[] list, T item) {
	   int count = 0;
	   if (item == null) {
	      for ( T listItem : list )
	         if (listItem == null)
	            count++;
	   }
	   else {
	      for ( T listItem : list )
	         if (item.equals(listItem))
	            count++;
	   }
	   return count;
	}   

}
