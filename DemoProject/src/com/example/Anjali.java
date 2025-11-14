package com.example;

sealed class Human permits Manish
{   
   public void printName()
   {
       System.out.println("Default");
   }
}
sealed class Manish extends Human permits Vartika
{
   public void printName()
   {
       System.out.println("Manish Sharma");
   }
}
sealed class Vartika extends Manish permits Anjali
{
   public void printName()
   {
       System.out.println("Vartika Dadheech");
   }
}
final class Anjali extends Vartika
{
   public void printName()
   {
       System.out.println("Anjali Sharma");
   }
}
