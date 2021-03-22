package com.basics.strings;

public class ChangeCase {
	public static void main(String[] args) {
		String str1 = "Happy Birthday";
		StringBuffer str = new StringBuffer(str1);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str1.charAt(i))) {
				str.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
				
			} else if (Character.isUpperCase(str1.charAt(i))) {
				str.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}

			}
			System.out.println("string after case conversion=" +str);
		}
	}


