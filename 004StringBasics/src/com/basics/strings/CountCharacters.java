package com.basics.strings;

public class CountCharacters {
	public static void main(String[] args) {

		String string = "Name of the student is praveen";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
			}

		
		System.out.println("Total no of characters in the string=" + count);
		
	}

}