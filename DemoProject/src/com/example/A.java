package com.example;

public class A {

}

public class B extends A{
	public static void main(String[] args) {
		A a=new B();// means b object references A
		System.out.println(a instanceof B);
	}
}