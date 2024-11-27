package org.example.FactoryMethod;

// Concrete Creator : GarageBike...
public class GarageMotorCycle extends Garage {
    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
}
