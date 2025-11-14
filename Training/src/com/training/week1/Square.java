package com.training.week1;

public class Square implements Shape{
	int a;
	Square(int a){
		this.a=a;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is "+(a*a));
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square is "+(a*4));
		
	}

}
