package com.example;

public class Exception {
	public static void main(String[] args) {
		int x=3;
		int y=0;
		try
		{
			System.out.println("Welcome to Java");
			System.out.println("Division of"+x+"/"+y+"is "+(x/y));
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter non zero value"+e);
		}
	System.out.println("Bye");
	}

}
