package com.constructor.oops;

public class TestAccount1 {
	public static void main(String[] args) {
		Account1 a = new Account1(123, "praveen");
		System.out.println(a.getName());
		System.out.println(a.getNo());
		a.setAmount(25000);
		System.out.println(a.getAmount());
		a.credit(15000);
		System.out.println(a.getbalance());
		a.deboit(20000);
		System.out.println(a.getbalance());
		System.out.println(a.getAmount());
	
		
		
		
		
		
	}

}
