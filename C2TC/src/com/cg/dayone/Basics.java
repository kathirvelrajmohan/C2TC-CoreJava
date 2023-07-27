package com.cg.dayone;
import java.util.*;
public class Basics {

	public static void main(String[] args) {
		System.out.print("HI ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			
			System.out.println("Enter the Number 1");
			int a = sc.nextInt();
			System.out.println("Enter the Number 2");

			int b = sc.nextInt();
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			System.out.println("1. add , 2. sub 3. multiply, 4. division");
			int t = sc.nextInt();
			System.out.print("Your answer is: ");

			if(t == 1) {
				System.out.println(a+b);
			}
			else if(t == 2) {
				System.out.println(a-b);
			}
			else if(t == 3) {
				System.out.println(a*b);
				
			}
			else if(t == 4) {
				System.out.println(a/b);
			}
			else {
				System.out.println("you Entered the invaid input");
			}
		}

	}

}
