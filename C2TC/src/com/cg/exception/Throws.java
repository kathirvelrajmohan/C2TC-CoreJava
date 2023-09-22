package com.cg.exception;
 class A {
	public void show() throws ClassNotFoundException {
		Class.forName("Demo");
		System.out.println("Class Found");
	}
}

public class Throws {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		try {
			obj.show();
			System.out.println("Class Found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not Found");
		}
	}
	

}
