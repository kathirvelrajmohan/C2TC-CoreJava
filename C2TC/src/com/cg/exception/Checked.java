package com.cg.exception;



public class Checked {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class temp = Class.forName("com.cg.exception.NestedTryBlock");
			System.out.println("Try block runs.");
		}
		catch(ClassNotFoundException e) {
			System.err.println("Class Not Found");
		}
		

	}

}
