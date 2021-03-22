package com.objectandclass;

public class Employee {
	 int id;  
	    String name;  
	    float salary;  
	    public void insert(int i,String n,float s) {
	    	id=i;
	    	name=n;
	    	salary=s;
	    	
	    	
	    }
	    void display() {
	    	System.out.println("id="+id);
	    	System.out.println("name="+name);
	    	System.out.println("salary="+salary);

		}
	    

}
