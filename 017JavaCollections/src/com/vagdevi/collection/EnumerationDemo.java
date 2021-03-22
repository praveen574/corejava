package com.vagdevi.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add("pavan");
		v.add("praveen");
		v.add("naveen");
		v.add("paaji");
		System.out.println(v);
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
				System.out.println(en.nextElement());
				
		    		
		
		
		
		

}}
}
