package com.basics.strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "home";
		String str2 = "eomh";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);

			if (Arrays.equals(string1, string2) == true) {
				System.out.println("both the strings are Anagram ");

			} else {
				System.out.println("both the strings are not Anagram");
			}

		}

	}

}
