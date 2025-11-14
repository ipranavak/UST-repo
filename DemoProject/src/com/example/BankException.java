package com.example;

import java.util.Scanner;

public class BankException {
	public static void main(String[] args) {
		System.out.println("Enter amount to withdraw");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int amount=10000;
		try {
			amount-=a;
			
		}
		catch(Exception e) {
			System.out.println();
			
		}
		
	}

}
