package org.example.Decorator;

public class CakeSpecification extends Cake {
    @Override
    public void prepare() {
        System.out.println("Cake prepared...");
    }
}
