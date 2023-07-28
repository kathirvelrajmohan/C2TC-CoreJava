package com.cg.staticmethod;

public class StaticMethod {
	static int a = 43;
//	StaticMethod(){
//		a = 5;
//		System.out.println("Value change to "+ a);
//	}
//	static{
//		a = 5;
//		System.out.println("This is static block");
//		System.out.println("The a value changes "+ a);
//	}
	void oo() {
		a = 897;
		System.out.println(a);
	}
//	static void Display() {
//		a=3;
//		System.out.println("Display method calls");
//		System.out.println(a);
//	}
}
