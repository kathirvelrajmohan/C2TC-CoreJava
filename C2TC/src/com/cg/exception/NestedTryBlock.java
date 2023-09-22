package com.cg.exception;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];
		x = new int[] {1,2,3,4,5};
		try {
			System.out.println(x[44]);
			try {
				x[3] = x[3]/0;
				System.out.println(x[3]);
				
			}
			catch(ArithmeticException e2) {
				System.out.println("The Value is Divided by zero");
				System.out.println(e2.getMessage());
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array is low");
			System.out.println(e.getMessage());
		}
		

	}

}
