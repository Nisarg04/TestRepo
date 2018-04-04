package com.multithreading.deadlock;

public class DeadLockDemo {
	public static void main(String[] args) {
		ThreadClass1 tc = new ThreadClass1();
		Thread t1 = new Thread(tc, "t1");
		Thread t2 = new Thread(tc, "t2");
		t1.start();
		t2.start();
		System.out.println("back home..");
	
	}
}


class ThreadClass1 implements Runnable {
	Object o1 = new Object();
	Object o2 = new Object();
	int flag = 0;
	
	public void run() {
		if(flag == 0)
		{
			flag=1;
			m1();
		}
		else
		{
			m2();
		}
	}

	private void m2() {
		synchronized (o1) {
			System.out.println(Thread.currentThread().getName() + " locked o1");
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " waiting for o2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (o2) {
				System.out.println(Thread.currentThread().getName() + " locked o2");
			}
		}
		System.out.println("m2..");
	}

	private void m1() {
		synchronized (o2) {
			System.out.println(Thread.currentThread().getName() + " locked o2");
			try {
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " waiting for o1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (o1) {
				System.out.println(Thread.currentThread().getName() + " locked o1");
			}
		}
		System.out.println("m1..");
	}

}
