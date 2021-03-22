package com.basics.strings;

public class DivideString {
	public static void main(String[] args) {
		String str = "praveendoppa";
		int len = str.length();
		int n = 3;
		int temp = 0;
		int chars = len / n;
		String[] equalstr = new String[n];
		if (len % n != 0) {
			System.out.println("string cannot be divided into" + n + "equal parts");

		} else {
			for (int i = 0; i < len; i = i + chars) {
				// Dividing string in n equal part using substring()
				String part = str.substring(i, i + chars);
				equalstr[temp] = part;
				temp++;

			}
			System.out.println(n + "equel parts of given string are");
			for (int i = 0; i < equalstr.length; i++) {
				System.out.println(equalstr[i]);
			}
		}

	}
}