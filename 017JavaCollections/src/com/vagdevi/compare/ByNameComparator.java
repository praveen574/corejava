package com.vagdevi.compare;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEname().compareTo(o2.getEname());
	}

}
