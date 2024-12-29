package org.example.Decorator;

public class Main {
    public static void main(String[] args) {
        CakeSpecification cake = new CakeSpecification();
        CakeChocolateDecorator chocolateDecorator = new CakeChocolateDecorator(cake);
        chocolateDecorator.prepare();
    }
}
