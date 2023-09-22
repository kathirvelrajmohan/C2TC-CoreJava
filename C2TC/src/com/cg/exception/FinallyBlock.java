package com.cg.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[] {1,2,3,4,5};
		try {
			System.out.println(x[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Error");
		}
		finally {
			System.out.println("The Finally blocks runs.");
		}
	}

}
