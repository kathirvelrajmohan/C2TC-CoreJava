package com.cg.exception;
//program for unchecked exception 
public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//runtime = unchecked
		int x[];
		x = new int[] {1,2,3,4,5};
		try {
			System.out.println(x[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Error");
		}
		System.out.println("Normal flow of the program");

	}

}
