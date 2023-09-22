package com.cg.thread;
class A1 implements Runnable{
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
class B1 implements Runnable{
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
public class RunnableInterface {

	public static void main(String[] args) {
		Runnable obj1 = new A1();
		Runnable obj2 = new B1();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}
