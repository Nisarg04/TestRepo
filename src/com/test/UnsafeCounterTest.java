package com.test;
public class UnsafeCounterTest {

	public static void main(String[] args) {

	    UnsafeCounter unsafeCounter = new UnsafeCounter();
	    Thread first = new Thread(() -> {
	      for (int i = 0; i < 5; i++) { 
	        unsafeCounter.inc();
	      }
	    });
	    Thread second = new Thread(() -> {
	      for (int i = 0; i < 5; i++) {
	        unsafeCounter.dec();
	      }
	    });
	    first.start();
	    second.start();
	    try {
			first.join();
			second.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    System.out.println("Current counter value: " + unsafeCounter.get());
	  
	}
}

class UnsafeCounter {
	private volatile int counter;
	public void inc() {
		counter++;
	}
	public void dec() {
		counter--;
	}
	public int get() {
		return counter;
	}
}
