package com.vagdevi.lambda;

public interface Sub {
	int sub(int a, int b);

	public static void main(String[] args) {
		Sub sub = (a, b) -> {
			return (a - b);
		};
		System.out.println(sub.sub(20, 10));
		System.out.println(sub.sub(30, 10));

	}

}
