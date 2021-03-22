package com.vagdevi.collection;

import java.util.TreeSet;

public class TestEmployee {
	public static void main(String[] args) {
		TreeSet<Employee>ts=new TreeSet<>();
		ts.add(new Employee(108, "praveen", 10000.0f));
		ts.add(new Employee(109, "pavan", 20000.0f));
		ts.add(new Employee(102, "naveen", 30000.0f));
		
	//	System.out.println(ts);
		for (Employee e: ts) {
			System.out.println(e);
			
		}

	}

}
