package com.cg.dayseven;

public class SBI extends RBI{
	private float result;
	float interest(int p, int n) {
		float r = 6f;
		result = (p*n*r)/100;
		return result;
		
	}
}
