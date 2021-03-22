package com.vidvan.generics;

public class TestGenerics2 {

	public static void main(String[] args) {

		MyGeneric2<String> instance = new MyGeneric2<String>();
		instance.setT("lokesh");
//instance.setT("praveen");
		instance.display();

	}

}
