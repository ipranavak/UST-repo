package com.example;



public class Demo implements Runnable{



public static void main(String[] args) {

Demo rn=new Demo();

Thread th1=new Thread(rn);

th1.start();

Thread th2=new Thread(rn);

th2.start();


}

@Override

	public void run() {

System.out.println("Runnable Object");

}};
