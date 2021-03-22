package com.vidvan.calbyvalue;

public class Operation2 {
	int data = 500;

	void change(Operation2 op) {
		data = data + 100;
	}

	public static void main(String args[]) {
		Operation2 op = new Operation2();

		System.out.println("before change " + op.data);
		op.change(op);
		System.out.println("after change " + op.data);

	}
}