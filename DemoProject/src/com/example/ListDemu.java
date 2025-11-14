package com.example;

import java.util.Arrays;
import java.util.List;

public class ListDemu {
	public static void print(String n) {
		System.out.println(n);
	}
public static void main(String[] args) {
//	List<Integer> l=Arrays.asList(33,11,55,2,5);
//	l.forEach(System.out::println);
	String names[]= {"Arjun","Rajesh","Karthik","Suman"};
	Arrays.stream(names).forEach(ListDemu::print);
}
}
