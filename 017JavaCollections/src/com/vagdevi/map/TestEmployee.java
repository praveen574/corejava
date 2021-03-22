package com.vagdevi.map;

import java.util.HashMap;
import java.util.Map;

public class TestEmployee {
	public static void main(String[] args) {
		Map<Employee, Integer> m = new HashMap<Employee, Integer>();
		Employee emp1 = new Employee(32, "Arion");
		Employee emp2 = new Employee(13, "virat");
		Employee emp3 = new Employee(43, "rohit");
		Employee emp4 = new Employee(32, "Arion");

		m.put(emp1, 1);
		m.put(emp2, 21);
		m.put(emp3, 44);
		m.put(emp4, 12);
		for (Map.Entry n : m.entrySet()) {
			System.out.println(n.getKey() + " :" + n.getValue());
		}


	}

}
