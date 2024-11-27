package org.example.FactoryMethod;

// Concrete Creator : GarageBike
public class GarageBike extends Garage {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
