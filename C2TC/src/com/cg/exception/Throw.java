package com.cg.exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		try {
			j = i/9;
			if(j == 0) {
				throw new ArithmeticException("Not able to print zero");
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
