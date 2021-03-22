package com.vagdevi.collection;

import javax.print.DocFlavor.STRING;

public class Employee implements Comparable<Employee> {
	private int eid;
	private String ename;
	private float esal;

	public Employee(int eid, String string, float f) {
		super();
		this.eid = eid;
		this.ename = string;
		this.esal = f;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return Float.compare(o.esal, this.esal);
		
//		if (esal == o.esal)
//			return 0;
//
//		else if (esal > o.esal)
//			return 1;
//		else
//			return -1;
	}
}
