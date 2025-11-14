package com.training.week1;

public class AnimalMain {

	public static void main(String[] args) {
		Dog d=new Dog("Cesar");
		Cat c=new Cat("Meow");
		d.eat();
		d.sleep();
		d.makeSound();
		c.eat();
		c.sleep();
		c.makeSound();

	}

}
