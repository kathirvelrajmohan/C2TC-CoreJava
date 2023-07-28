package com.cg.daytwo;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if(n>10) {
			System.out.println("The number is greater than 10");
		}
		else {
			System.out.println("The number is lesser than or equal to 10");
		}
	}

}
