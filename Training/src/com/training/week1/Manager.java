package com.training.week1;

public class Manager extends Employee {
	String department;
	Manager(String department,String name,double salary){
		super(name,salary);
		this.department=department;
	}
	void displayInfo(){
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}

}
