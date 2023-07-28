package com.cg.daytwo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter the number 2: ");
		int b = sc.nextInt();
		System.out.println("1.Add 2.Sub 3.Mul 4.Div");
		System.out.print("Enter your option: ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("You entered the wrong value");
		}
		
		

	}

}
