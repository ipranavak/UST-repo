package com.example;

public class InvalidAgeException extends Exception{

	int age;
	public InvalidAgeException(int age) {
		this.age=age;
	
}
	public String toString() {
		return "InvalidAgeException [age=" + age +"]";
	}
}
