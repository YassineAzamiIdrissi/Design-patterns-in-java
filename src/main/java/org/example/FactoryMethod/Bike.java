package org.example.FactoryMethod;

// ConcreteProduct : Bike...
public class Bike implements Vehicle {
    boolean damaged = true;

    @Override
    public void repare() {
        if (damaged) {
            damaged = false;
            System.out.println("Bike repaired");
        }
    }
}
