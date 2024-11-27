package org.example.FactoryMethod;

// Concrete Creator : GarageCar...
public class GarageCar extends Garage {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
