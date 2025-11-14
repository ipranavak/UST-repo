package com.training.prog;
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Carr extends Vehicle {
    void honk() { System.out.println("Car honks!"); }
}

class Bike extends Vehicle {
    void kickStart() { System.out.println("Bike kick-started!"); }
}

public class VehicleTest {
    public static void main(String[] args) {
        Carr c = new Carr();
        Bike b = new Bike();
        c.start(); c.honk();
        b.start(); b.kickStart();
    }
}
