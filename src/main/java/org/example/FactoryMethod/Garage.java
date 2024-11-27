package org.example.FactoryMethod;

public abstract class Garage {
    int numWorkers;
    int dailyWorkHours;

    public Vehicle repair() {
        Vehicle v = createVehicle();
        v.repare();
        return v;
    }

    public abstract Vehicle createVehicle();
}
