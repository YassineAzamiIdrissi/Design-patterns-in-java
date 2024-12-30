package org.example.Facade;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.buildCar("decoration_1", "architecture_1", 4);
    }
}
