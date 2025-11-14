package com.example;

public class Exx {
//public static void main(String[] args) {
//	String str=""" 
//			hello java is simple
//					very niice
//					""";
//	System.out.println(str);
	record Employee(int empid,String empnamw)
	{
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Karthik");
		Employee e2=new Employee(101,"Karthik");
		System.out.println(e1.equals(e2));
	}
}
