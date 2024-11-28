package org.example.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f1 = new HomeFactory();
        f1.createKit();
        f1.createStadium();
        System.out.println(".........");
        AbstractFactory f2 = new AwayFactory();
        f2.createKit();
        f2.createStadium();
    }
}
