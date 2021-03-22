package com.java5features;

public class VarargesExample1 {
	static void display(String...values){
		System.out.println("display method invoked");
	}
	
	public static void main(String[] args) {
		display();
		display("hello");
		display("my","name","is","praveen");
		
	}
		
	}


