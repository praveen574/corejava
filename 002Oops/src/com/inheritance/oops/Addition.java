package com.inheritance.oops;

public class Addition {
	int a,b;
	
void Addition() {
	System.out.println(a+b);
}}
class sub extends Addition{
	void sub() {
		System.out.println(a-b);
		
	}	
}
	class mul extends sub{
		void mul() {
			System.out.println(a*b);
		}			
	}
	
		class Div extends mul{
			void Div() {
				System.out.println(a/b);
			}		
		
	
		
			
		}
	

