package com.vagdevi.lambda;

public interface Add {

	void add(int a, int b);

	public static void main(String[] args) {

		Add add = (x, y) -> {
			System.out.println("addition:" + (x + y));
			System.out.println("sub:" + (x - y));
			System.out.println("mul:" + (x * y));

		};
		add.add(20, 10);
	}

}
