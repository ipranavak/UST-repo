package com.training.week1;

public class Cat extends Mammal{
	public void makeSound() {
		System.out.println("Cat Meows");
	}
	
	public void eat() {
		System.out.println("Cat is Eating");
	}
	Cat(String name){
		super(name);
	}
 
}
