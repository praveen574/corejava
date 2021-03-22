package com.vagdevi.compare;

import java.util.Comparator;

public class ByIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEid()>o2.getEid()) {
			
		return -1;
		}else if(o1.getEid()<o2.getEid()) {
			return 1;
		}else {
			return 0;
		}
	}

}
