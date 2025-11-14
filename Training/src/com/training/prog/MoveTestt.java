//PolymorphismInterfaces
package com.training.prog;
interface Mover {
    void move();
}

class Car implements Mover {
    public void move() { System.out.println("Car drives on road."); }//overridding
}

class Bird implements Mover {
    public void move() { System.out.println("Bird flies in the sky."); }//overriding
}

public class MoveTestt {
    public static void main(String[] args) {
        Mover m1 = new Car();
        Mover m2 = new Bird();
        m1.move();
        m2.move();
    }
}
