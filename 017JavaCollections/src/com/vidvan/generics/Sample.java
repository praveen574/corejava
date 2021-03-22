package com.vidvan.generics;

public class Sample<TYPE extends Number> {
	private TYPE type;
	public Sample() {
		
	}
	public Sample(TYPE type) {

		this.type = type;
	}
	public void showType() {
		System.out.println(type.getClass().getName());
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	
	
	

}
