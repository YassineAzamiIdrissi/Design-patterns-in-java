package org.example.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f1 = new HomeFactory();
        Kit kit = f1.createKit();
        Stadium st = f1.createStadium();
        System.out.println(".........");
        AbstractFactory f2 = new AwayFactory();
        Kit kit_ = f2.createKit();
        Stadium st_ = f2.createStadium();
    }
}
