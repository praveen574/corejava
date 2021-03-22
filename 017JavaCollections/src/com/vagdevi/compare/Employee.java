package com.vagdevi.compare;

public class Employee implements Comparable<Employee> {
	private int eid;
	private String ename;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.eid > o.getEid()) {
			return -1;
		} else if (this.eid < o.getEid()) {
			return 1;
		} else
			return 0;
	}

//	public int compareTo(Employee o) {
//		return o.ename.compareTo(this.getEname());
//
//	}
}



