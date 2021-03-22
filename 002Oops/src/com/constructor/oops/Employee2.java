package com.constructor.oops;

public class Employee2 {
	public String empName;
	public int empSalary;
	public String address;

	// default constructor of the class
	public Employee2() {

		this("PRAVEEN");

	}

	public Employee2(String empName) {

		this(empName, 150000);

	}

	public Employee2(String empName, int empSalary) {
		this(empName, empSalary, "hyd");

	}

	public Employee2(String empName, int empSalary, String address) {

		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}

	void disp() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Address: " + address);
	}
}