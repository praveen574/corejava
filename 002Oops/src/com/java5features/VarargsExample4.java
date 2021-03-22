package com.java5features;

public class VarargsExample4 {
	void demoMethod(int... args) {
		for (int arg : args) {
			System.out.println(arg);
		}
	}

	public static void main(String args[]) {
		VarargsExample4 obj = new VarargsExample4();
		obj.demoMethod(1101, 10225, 26);
		obj.demoMethod(22365, 12);
		obj.demoMethod(1);
	}

}
