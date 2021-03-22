package com.java5features;

import static java.lang.System.out;
import static java.lang.Math.*;

class StaticImportExample2 {
	public static void main(String args[]) {
		
		double var1 = sqrt(5.0);
		
		double var2 = tan(30);
		
		out.println("Square of 5 is:" + var1);
		out.println("Tan of 30 is:" + var2);
	}
}