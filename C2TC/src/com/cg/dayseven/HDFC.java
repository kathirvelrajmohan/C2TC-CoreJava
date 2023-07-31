package com.cg.dayseven;

public class HDFC extends RBI{
	private float result;
	float interest(int p, int n) {
		float r = 4f;
		result = (p*n*r)/100;
		return result;
		
	}
}
