package com.objectandclass;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.insert(1423433, "praveen", 20000);
		a.display();
		a.checkBalance();
		a.deposit(12000);
		a.withdraw(3000);
		a.checkBalance();
	}

}
