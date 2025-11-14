package com.training.week1;

public class Triangle implements Shape {
	int a;
	int b;
	int c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void area() {
		System.out.println("Area of Triangle is "+(a*b)/2);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Triangle is "+(a+b+c));
	}


}
