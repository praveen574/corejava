package com.basics.strings;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str1 = "my name is praveen";
		str1 = str1.replaceAll("\\s+", "");
		System.out.println("string after removing white spaces=" + str1);
	}

}
