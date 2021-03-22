package com.vagdevi.lambda;

public interface SayHello {
	void hello ();

	public static void main(String[] args) {

		String name = "praveen";
		SayHello h = () -> {

			System.out.println("Hello  " + name);

		};
		h.hello();
	}

}
