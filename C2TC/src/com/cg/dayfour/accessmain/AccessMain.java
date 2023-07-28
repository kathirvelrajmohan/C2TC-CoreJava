package com.cg.dayfour.accessmain;

import com.cg.dayfour.accessmethods.AccessMethod1;

public class AccessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessMethod1 a = new AccessMethod1();
		System.out.println(a.name);
		//private
//		System.out.println(a.id);
		
		//default
//		System.out.println(a.mobile);
		
		//protected
//		System.out.println(a.mail);

		//Only Public variable is called from another package
		
		//Methods
		
		a.display2();
		
		//only public methods calls
	}

}
