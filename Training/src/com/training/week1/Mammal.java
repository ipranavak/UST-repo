package com.training.week1;

public abstract class Mammal implements Animal{
	Mammal(){
		
	}
	String name;
	Mammal(String name){
		this.name=name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+" is Eating");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name+" is Sleeping");
	}
	abstract void makeSound();

}
