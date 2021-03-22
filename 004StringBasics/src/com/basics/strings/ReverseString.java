package com.basics.strings;

public class ReverseString {
	public static void main(String[] args) {
		String name="Dream big";
		String reversedStr=" ";
		for(int i=name.length()-1;i>0;i--) {
			
			reversedStr=reversedStr+name.charAt(i);
			
		}
		System.out.println("reverse of string="+reversedStr);
	}

}
