package com.example;

public class Ex {
int x=22;
void disp(int x) {
	System.out.println("Local variable is" +this.x);
	//this.x=x;
}
public static void main(String[] args) {
	Ex obj=new Ex();
	obj.disp(77);
	System.out.println("Instance  variable is"+obj.x);
}
public static void div(int x2, int y) {
	// TODO Auto-generated method stub
	
}
}
