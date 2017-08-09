package com.multithreading.runnable.example;

public class Racer implements Runnable{

	private String winner;
	public void startRace()
	{
		System.out.println("Thread Started : " +Thread.currentThread().getName());
		for(int i=0; i<=10; i++)
		{ 
			try {
				if(Thread.currentThread().getName().equals("Hare"))
					Thread.sleep(10);
				else
					Thread.sleep(8);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Distance covered by "+Thread.currentThread().getName()+ " is " + i +" metres ");
			boolean flag = iscomplete(i);
			if(flag)
				break;
		}
	}

	private boolean iscomplete(int i) {

		if(i==10 && winner == null){
			winner = Thread.currentThread().getName();
			System.out.println("Winner is : " + winner);
			return true;
		}
		else if(winner==null)
		{
			return false;
		}
		else if(winner !=null)
		{
			return true;
		}
		return false;
	}

	public void run() {
		this.startRace();
	}

}
