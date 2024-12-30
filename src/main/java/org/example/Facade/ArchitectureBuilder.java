package org.example.Facade;

public class ArchitectureBuilder {
    private String architecture;

    public ArchitectureBuilder(String architecture) {
        this.architecture = architecture;
    }

    public ArchitectureBuilder() {
    }

    public void setArchitecture(String architecture) {
        System.out.println("Architecture built : " + architecture);
        this.architecture = architecture;
    }
}
