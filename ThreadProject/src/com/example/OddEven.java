package com.example;

public class OddEven {
	int number=10;
 public synchronized void odd(int number) {
	 for(int i=0;i<number;i++) {
	 if(i%2!=0) {
		 System.out.println(number);
	 }
	 else
	 {
		 try {
			wait();
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	 }
 }
public synchronized void even(int number) {
	System.out.println(i);
	notify();
}
}
public static void main(String[] args) {
	OddEven o=new OddEven();
new Thread(){ 
	public void run()
	{
	o.odd(10);
	}
	}.start();

new Thread(){ 
	public void run()
	{
	o.even(10);
	}
	}.start();
}
}



