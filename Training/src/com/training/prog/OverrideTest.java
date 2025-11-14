//methodoverriding
package com.training.prog;
class Animal {
    void makeSound() { System.out.println("Animal makes a sound"); }
}

class Dogg extends Animal {
    void makeSound() { System.out.println("Dog barks"); }
}

public class OverrideTest {
    public static void main(String[] args) {
        Animal a = new Dogg();//refernce is a but object it points to is child
        a.makeSound();//method overriding
    }
}
