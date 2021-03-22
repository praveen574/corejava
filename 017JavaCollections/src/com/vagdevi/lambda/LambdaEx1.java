package com.vagdevi.lambda;

public interface LambdaEx1 {
	String reverse(String n);

	public static void main(String[] args) {
LambdaEx1 lambda=(str)->{
	
	String result="";
	for(int i =str.length()-1;i>=0;i--) {
		result +=str.charAt(i);
		
		
	}
	
	return result;
	
};
System.out.println("Lambda reversed = " + lambda.reverse("Lambda"));
    

}
	}

