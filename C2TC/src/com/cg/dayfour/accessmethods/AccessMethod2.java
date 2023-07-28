package com.cg.dayfour.accessmethods;

public class AccessMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessMethod1 a = new AccessMethod1();
		//public
		System.out.println(a.name);
		//private
//		System.out.println(a.id);
//id in is private variable it can't able to call
		
		//default
		System.out.println(a.mobile);
		
		//protected
		System.out.println(a.mail);
		a.display1();
		a.display2();
		//private
//		a.display3();
		a.display4();
		
		//public method not used in different class
	}

}
