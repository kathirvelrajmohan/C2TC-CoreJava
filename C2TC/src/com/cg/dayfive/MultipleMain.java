package com.cg.dayfive;

public class MultipleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleMethod3 m = new MultipleMethod3();
		m.setreg(101); //parent class method
		System.out.println(m.getreg());
		m.setMarks(66); //intermediate sub class method
		System.out.println(m.getMarks());
		m.setArrear(false); //child class method
		if(m.isArrear()) {
			System.out.println("Student Having a Arrear");
		}
		else {
			System.out.println("Student cleared all subjects");
		}
	}

}
