package com.vagdevi.compare;

import java.util.Map;
import java.util.TreeMap;

public class TestEmployee {
	public static void main(String[] args) {
		Map<Employee, Integer> m = new TreeMap<Employee, Integer>(new ByIdComparator());
		Employee emp1 = new Employee(07, "Dhoni");
		Employee emp2 = new Employee(25, "virat");
		Employee emp3 = new Employee(12, "rohit");
		Employee emp4 = new Employee(33, "praveen");

		m.put(emp1, 23);
		m.put(emp2, 21);
		m.put(emp3, 44);
		m.put(emp4, 11);
		for (Map.Entry n : m.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}
	}


	}


