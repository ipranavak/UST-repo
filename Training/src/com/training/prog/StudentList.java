//operationsonArraylist
package com.training.prog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Studentt{
    private String name;
    private int id;

    public Studentt(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding toString() for easy printing (Polymorphism)
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public String getName() {
        return name;
    }
}

public class StudentList {
    public static void main(String[] args) {
     
        List<Studentt> students = new ArrayList<>();//from List interface choosing students to be arraylist

        students.add(new Studentt("Arun", 101));
        students.add(new Studentt("Meera", 102));
        students.add(new Studentt("Vikram", 103));
        students.add(new Studentt("Preeti", 104));
        
        System.out.println("Total Students: " + students.size());
        
        System.out.println("Student at Index 1: " + students.get(1)); // Meera
        
        // Iterator
        Iterator<Studentt> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            Studentt s = studentIterator.next();
            System.out.println(s);
            
            if (s.getName().equals("Preeti")) {
                studentIterator.remove(); // removes the element
            }
        }
        
        System.out.println("Remaining Students: " + students.size());
        // Use the simple enhanced for loop to display the final list
        for (Studentt s : students) {
            System.out.println(s);
        }
    }
}