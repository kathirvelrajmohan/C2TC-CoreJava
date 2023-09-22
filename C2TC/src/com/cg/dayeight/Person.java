package com.cg.dayeight;

public class Person implements BankInterface{
	String name;
	String city;
	float currentBalance;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
		this.currentBalance = 3000;
		System.out.println("Welcome "+name+"!");

	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		name = "kathir";
		city = "Villupuram";
		this.currentBalance = 3000;
		System.out.println("Welcome "+name+"!");


	}

	@Override
	public void withdraw(float amount) {
		
		if((currentBalance-amount)<minBalance) {
			System.out.println("Your balance is very low. we can't perform the operation");
			
		}
		else {
			currentBalance-=amount;
			System.out.println("Your current balance is " + currentBalance);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	@Override
	public void deposit(float amount) {
		if(amount>=limit) {
			System.out.println("You are deposited more than the limit. The limit is 10000");
		}
		else {
			currentBalance+=amount;
			System.out.println("Current Balance: "+currentBalance);
		}
	}
	
}
