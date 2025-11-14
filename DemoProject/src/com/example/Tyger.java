package com.example;

import java.security.DomainCombiner;

public class Tyger {
//	public void tigerEat() {
//		System.out.println("Eats only Non Veg");
//	}
//public static void main(String[] args) {
//	Tyger t=new Tyger();
//	Anumal a=t::tigerEat;
//	a.eat();
	
public static void TygerEat(int x){
	System.out.println("tiger object");
	
}
public static void main(String[] args) {
	Anumal a=Tyger::TygerEat;
	a.eat(5);
}
}
