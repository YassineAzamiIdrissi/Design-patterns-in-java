package org.example.FactoryMethod;

// ConcreteProduct : MotorCycle...
public class MotorCycle implements Vehicle {
    boolean damaged = true;

    @Override
    public void repare() {
        if (damaged) {
            System.out.println("MotorCycle repaired");
            damaged = false;
        }
    }
}
