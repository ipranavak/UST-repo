//Encapsulation
package com.training.prog;
class Student {
    private String name;
    private int age;//hidden
    private char grade;

    public void setName(String name) { this.name = name; }

    public void setAge(int age) {//defining setters
        if (age > 0) this.age = age;
        else System.out.println("Invalid age!");
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') this.grade = grade;
        else System.out.println("Invalid grade!");
    }

    public String getName() {//getters
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }
}

public class StudentEncap {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        s.setAge(20);
        s.setGrade('B');
       System.out.println(s.getName()+" " + s.getAge()+" "+ s.getGrade()); 
        
       
    }
}
