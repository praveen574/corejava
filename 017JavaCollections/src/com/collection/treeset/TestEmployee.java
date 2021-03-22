package com.collection.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.cllection.arraylist.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Set<Employee> employees = new TreeSet(new MyComparatorEno());
		employees.add(new Employee(1, "praveen", 15000.0));
		employees.add(new Employee(7, "naveen", 15000.0));
		employees.add(new Employee(3, "suresh", 15000.0));
		employees.add(new Employee(4, "jaan", 15000.0));
		employees.add(new Employee(3, "khan", 15000.0));
		employees.add(new Employee(4, "mahesh", 15000.0));
		//Collections.sort(employees);

		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
}
