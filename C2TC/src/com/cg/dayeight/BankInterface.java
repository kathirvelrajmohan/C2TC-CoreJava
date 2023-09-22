package com.cg.dayeight;

public interface BankInterface {
	static final float minBalance = 500;
	static final float limit = 10000;
	void withdraw(float amount);
	void deposit(float amount);
}
