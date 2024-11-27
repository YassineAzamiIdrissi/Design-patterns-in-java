package org.example.FactoryMethod;

public class Car implements Vehicle {
    boolean damaged = true;

    @Override
    public void repare() {
        if (damaged) {
            damaged = false;
            System.out.println("Car repaired");
        }
    }
}
