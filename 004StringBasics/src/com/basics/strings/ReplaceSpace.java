package com.basics.strings;

public class ReplaceSpace {
	public static void main(String[] args) {
		String string = "once in a time";
		char ch = '-';
		string = string.replace(' ', ch);
		System.out.println("String after replacing spaces with given character: ");
		System.out.println(string);

	}

}
