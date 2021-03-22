package com.vidvan.calbyvalue;

public class CallbyReference {
	int data = 45;

	void change(CallbyReference c) {
		data = data + 45;

	}

	public static void main(String[] args) {
		CallbyReference c = new CallbyReference();
		System.out.println("before=" + c.data);
		c.change(c);
		System.out.println("after=" + c.data);

	}

}
