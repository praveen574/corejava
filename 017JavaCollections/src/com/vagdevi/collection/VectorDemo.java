package com.vagdevi.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add("pavan");
		v.add("praveen");
		v.add("naveen");
		v.add("paaji");
		System.out.println(v.size());
		

for(int i=0;i<10;i++) {
	v.add(i);
	
}
System.out.println(v.size());
System.out.println(v.capacity());
System.out.println(v.removeElement(3));
System.out.println(v.size());
v.setSize(5);
System.out.println(v);
	}

}
