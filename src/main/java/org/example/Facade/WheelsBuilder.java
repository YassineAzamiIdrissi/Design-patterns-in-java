package org.example.Facade;

public class WheelsBuilder {
    private int numWheels;

    public WheelsBuilder() {
    }

    public WheelsBuilder(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setNumWheels(int numWheels) {
        System.out.println("number of wheels : " + numWheels);
        this.numWheels = numWheels;
    }
}
