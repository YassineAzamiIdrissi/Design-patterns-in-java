package org.example.FactoryMethod;

public class GarageBike extends Garage {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
