package com.objectandclass;

public class Account {
	int acc_no;
	String name;
	float amount;

	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;

	}

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");

	}

	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("insufficient balance");

		} else {
			if (amount > amt) {
				System.out.println("withdraw=" + amt);

			}
		}
	}

	// method to check the balance of the account
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	// method to display the values of an object
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}

}
