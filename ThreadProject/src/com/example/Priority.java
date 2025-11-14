package com.example;

public class Priority extends Thread {
	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println("Alive "+t1.isAlive());
		System.out.println(t1.getName()+"is running and priority is "+ t1.getPriority());
	}

}
