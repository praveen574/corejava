package com.constructor.oops;

public class Account1 {
	private String name;
	private int no;
	private double amount;
	private double balance;

	Account1(int no, String name) {
		this.name=name;
		this.no=no;
		

	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public double getAmount() {
		return amount;
	}

	public double getbalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setbalance(double balance) {

	}

	public void credit(double amount) {
		balance = balance + amount;
		System.out.println("available balance=" + balance);
	}

	public void deboit(double amount) {
		if (balance > amount) {
			balance = balance - amount;
			System.out.println("available balance" + balance);

		} else {
			System.out.println("insufficient funds");
		}
	}

}
