package com.constructor.oops;

public class Employee {
	private int eId;
	private String eName;
	private double eSal;
	
	public Employee(int eId,String eName,double eSal) {
	this.eId=eId;
	this.eName=eName;
	this.eSal=eSal;
	}
	public void display() {
		
	
		System.out.println("id="+eId);
		System.out.println("name="+eName);
		System.out.println("sal="+eSal);
	
	
		
	}
		

	}	
	
	


