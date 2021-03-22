package com.vidvan.generics;

public class Employee {
	private String name;
	private String company;

	public <T1, T2> Employee(T1 name, T2 company) {

		this.name = name.toString();
		this.company = company.toString();

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + "]";
	}

	public void dsplay() {
		System.out.println("name: " + this.name);
		System.out.println("company:" + this.company);
	}
	
}
