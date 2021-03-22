package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.collection.hashset.HahSetDemo3;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "test1", 15000.0));
		employees.add(new Employee(7, "test2", 15000.0));
		employees.add(new Employee(3, "test3", 15000.0));
		employees.add(new Employee(4, "test4", 15000.0));
		employees.add(new Employee(3, "test3", 15000.0));
		employees.add(new Employee(4, "test4", 15000.0));
		Collections.sort(employees);

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("after removing duplicates from the list");
		
		Set<Employee> tree = new HashSet<>(employees);
//		List<Employee> tree = new ArrayList<>();//sorting for set elements
//		Collections.sort(tree);
		for (Employee employee : tree) {
			System.out.println(employee);

		}

	}
}
