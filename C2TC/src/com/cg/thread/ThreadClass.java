package com.cg.thread;

class A extends Thread{
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class B extends Thread{
	public void run() {
		for(int i= 1;i<=10;i++) {
			System.out.println(i*10);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();

	}

}
