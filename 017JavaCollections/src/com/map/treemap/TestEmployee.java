package com.map.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestEmployee {
	public static void main(String[] args) {
//		TreeMap<Employee, String> tm = new TreeMap<>(new MyNameComparator());
		TreeMap<Employee, String> tm = new TreeMap<>(new MySalaryComp());

		tm.put(new Employee("Ram", 3000), "RAM");
		tm.put(new Employee("John", 6000), "JOHN");
		tm.put(new Employee("Crish", 2000), "CRISH");
		tm.put(new Employee("Tom", 2400), "TOM");
		Set<Employee> keys = tm.keySet();
		for (Employee key : keys) {
			System.out.println(key + " ==> " + tm.get(key));

		
		}}}