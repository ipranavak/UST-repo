package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInputStream {
public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	String name="";
	try {
		name=br.readLine();
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Hai "+name+"Welcome to UST Global");
}
}
