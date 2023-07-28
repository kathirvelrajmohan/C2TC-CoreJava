package com.cg.daytwo;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printing right angle triangle using *
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
