package com.cg.daytwo;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if(n>10) {
			if(n%2 == 0) {
				System.out.println(n + " is the even number and greater than 10");
				
			}
			else {
				System.out.println(n + " is the odd number and greater than 10");
			}
		}
		else {
			System.out.println(n + " is lesser than 10");
		}
		

	}

}
