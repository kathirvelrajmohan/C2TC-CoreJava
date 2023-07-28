package com.cg.dayfour.accessmethods;

public class AccessMethod1 {
	public String name = "kathir";
	private int id = 101;
	protected String mail = "kathir@gmail.com";
	long mobile = 839782;
	
	void display1() {
		System.out.println("default");
	}
	public void display2() {
		System.out.println("public");
	}
	private void display3() {
		System.out.println("private");
	}
	protected void display4() {
		System.out.println("Protected");
	}
	
}
