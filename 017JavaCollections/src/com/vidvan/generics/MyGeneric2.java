package com.vidvan.generics;

public class MyGeneric2 <T>{
	
	private T t;
	
	

//	public MyGeneric2() {
//		
//		this.t = t;
//	}
	public void display() {
		System.out.println("class details"+t.getClass().getName());
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	

}
