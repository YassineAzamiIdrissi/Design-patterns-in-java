package org.example.FactoryMethod;

public class GarageMotorCycle extends Garage {
    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
}
