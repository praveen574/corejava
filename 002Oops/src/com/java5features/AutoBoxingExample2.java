package com.java5features;

public class AutoBoxingExample2 {
	class Boxing1 {
		  void m(int i) {
			System.out.println("int");
		}

		void m(Integer i) {
			System.out.println("Integer");
		}

		public void main(String args[]) {
			short s = 30;
			m(s);
		}
	}

}
