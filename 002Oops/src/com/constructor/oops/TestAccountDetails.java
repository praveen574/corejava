package com.constructor.oops;

public class TestAccountDetails {
	public static void main(String[] args) {
		AccountDetails a=new AccountDetails(342156,50000.00);
			AccountDetails b=new AccountDetails(23456); 
				System.out.println("account no="+a.getaccountno());
				System.out.println("balance="+a.getbalance());
				System.out.println();
			b.setBalance(25000);
			System.out.println("account no="+b.getaccountno());
			System.out.println("balance="+b.getbalance());
			System.out.println();
			a.credit(10000);
			a.debit(20000);
			System.out.println();
			b.credit(11000);
			b.debit(12000);
			}
}

