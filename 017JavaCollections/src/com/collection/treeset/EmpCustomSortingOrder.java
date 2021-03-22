package com.collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class EmpCustomSortingOrder {
public static void main(String[] args) {

		
		Set<Employee> treeset = new TreeSet<>(new MyComparatorEno());
		treeset.add(new Employee(105, "anil", 14500.00));
		treeset.add(new Employee(102, "veerendra", 10000.00));
		treeset.add(new Employee(100, "sekahr", 12500.00));
		treeset.add(new Employee(101, "balaji", 11000.00));
		treeset.add(new Employee(103, "yuvi", 18000.00));
		treeset.add(new Employee(104, "vani", 17000.00));
		
		for (Employee employee : treeset) {
			System.out.println(employee);
		}

	}

}



