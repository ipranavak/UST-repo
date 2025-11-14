package com.training.week1;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Jack",2039884);
		Manager  m=new Manager("IT","John",50000);
		m.displayInfo();
		e.displayInfo();

	}

}
