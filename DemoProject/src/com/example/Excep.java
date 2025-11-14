package com.example;



public class Excep {

public static int arr[]=new int[5];

public static void div(int x,int y)

{

arr[0]=22;

arr[1]=33;



try

 {

 System.out.println("Division of "+x+" / "+y+" is "+(x/y));

arr[11]=77;

}

catch(ArithmeticException e)

{

System.err.println("Please enter non zero value "+e);

}

catch(ArrayIndexOutOfBoundsException ab)

{

ab.printStackTrace();

}

}

public static void main(String[] args) {

int x=22;

int y=0;

System.out.println("Welcome to Division Program");

Excep.div(x,y);

System.out.println("Bye...");

}

}