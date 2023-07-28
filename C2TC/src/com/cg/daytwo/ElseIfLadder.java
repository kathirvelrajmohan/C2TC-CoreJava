package com.cg.daytwo;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student mark: ");
		int n = sc.nextInt();
		if(n>100) {
			System.out.println("Please Enter the Valid Mark");
		}
		else if(n>80) {
			System.out.println("Grade A");
		}
		else if(n>60 && n<=80) {
			System.out.println("Grade B");
		}
		else if(n>40 && n<=60) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}

	}

}
