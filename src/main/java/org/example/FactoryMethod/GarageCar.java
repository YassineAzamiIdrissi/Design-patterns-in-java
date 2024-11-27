package org.example.FactoryMethod;

public class GarageCar extends Garage {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
