package com.cg.exception;

import java.util.Scanner;

class FailException extends Exception{
	
	public FailException(String s) {
		super(s);
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Mark of the Student: ");
		try {
			int a = sc.nextInt();
			if (a<35){
				throw new FailException("Student Fails");
			}
			else {
				System.out.println("Student Pass.");
			}
		}
		catch(FailException e) {
			System.out.println(e);
		}
		

	}

}
