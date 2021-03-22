package com.constructor.oops;

public class AccountDetails {
	private int accountno;
	private double balance;
	private double amount;
	
	
	public AccountDetails(int accountno,double balance) {
		this.accountno=accountno;
		this.balance=balance;
}
	public AccountDetails(int accountno) {
		this.accountno=accountno;
	
	}


	
public int getaccountno() {
	
return accountno;
}
public double getbalance() {
	return balance;
	
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void credit(double amount) {
	balance=balance+amount;
	System.out.println("available="+balance);
	
}
public void debit(double amount) {
	if(balance>=amount) {
		balance=balance-amount;
		System.out.println("amount withdrawn="+balance);
	}
	else {
		System.out.println("insufficient funds");
	}
}




	

}
