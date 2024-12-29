package org.example.Decorator;

public class CakeChocolateDecorator extends CakeDecorator {

    public CakeChocolateDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adorning the cake with chocolates..");
    }
}
