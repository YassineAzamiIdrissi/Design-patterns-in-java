package org.example.Facade;

// our facade ...
public class CarBuilder {
    private DecorationBuilder decorationBuilder;
    private ArchitectureBuilder architectureBuilder;
    private WheelsBuilder wheelsBuilder;

    public CarBuilder() {
        decorationBuilder = new DecorationBuilder();
        architectureBuilder = new ArchitectureBuilder();
        wheelsBuilder = new WheelsBuilder();
    }

    public void buildCar(String decoration, String architecture, int wheels) {
        decorationBuilder.setDecoration(decoration);
        architectureBuilder.setArchitecture(architecture);
        wheelsBuilder.setNumWheels(wheels);
        System.out.println("----------------------------");
        System.out.println("Car built !");
    }
}
