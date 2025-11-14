package com.training.week1;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
		
	}
	public void eat()
	{
		System.out.println("Dog is Eating");
	}

}
