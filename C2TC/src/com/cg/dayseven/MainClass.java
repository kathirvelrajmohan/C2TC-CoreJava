package com.cg.dayseven;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RBI r = new RBI();
//		r.display();
//		SBI s = new SBI();
//		s.display();
//		HDFC h = new HDFC();
//		h.display();
		int principal = 2000;
		int time = 2;
		
		RBI r;
		r = new RBI();
		System.out.println("RBI interest: "+r.interest(principal, time));
		r = new SBI();
		
		System.out.print("SBI Interest: ");
		System.out.println(r.interest(principal, time));
		r = new HDFC();
		System.out.println("HDFC Interest: "+r.interest(principal, time));
	}

}
