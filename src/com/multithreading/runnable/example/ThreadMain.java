package com.multithreading.runnable.example;

public class ThreadMain {

	public static void main(String[] args) {

		Racer racerObj = new Racer();

		Thread threadHare = new Thread(racerObj, "Hare");
		Thread threadRabbit = new Thread(racerObj, "Rabbit");

		Thread threadHare1 = new Thread(new Racer(), "Hare");
		Thread threadRabbit1 = new Thread(new Racer(), "Rabbit");
		threadHare.start();
		threadRabbit.start();
	}

}
