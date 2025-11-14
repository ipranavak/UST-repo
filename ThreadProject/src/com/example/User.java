package com.example;

public class User {
	public static void main(String[] args) {
//		A rn=new A();
//		Thread th1=new Thread(rn);
//		th1.run();
//		Runnable rn=()->{System.out.println("Runnable Interface");};
//		Thread th1=new Thread(rn);
//		th1.start();
//		
//		new Thread() {
//			public void run() {
//				System.out.println("First Thread");
//			}
//		}.start();
//		Thread th2=new Thread() {
//			public void run() {
//				System.out.println("Second Thread");
//			}
//		};
//		//th1.start();
//		th2.start();
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("Runnable Object");
			}
		}).start();
		
	}

		
	}


