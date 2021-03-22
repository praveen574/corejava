package com.superkeyword;

public class Employee extends Prerson  {
	float salary;
	Employee(int id,String name,float salary){
		super(id,name);//reusing parent constructor  

		this.salary=salary;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
		}  
	}
	


