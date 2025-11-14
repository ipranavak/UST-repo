// Abstract class
package com.training.prog;

abstract class Animals {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dogs extends Animals {
    // Implement the abstract method
    void makeSound() {
        System.out.println("Bark!");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {
        Animals myDog = new Dogs(); // Polymorphism
        myDog.makeSound();        // Outputs: Bark!
        myDog.sleep();            // Outputs: Sleeping...
    }
}
