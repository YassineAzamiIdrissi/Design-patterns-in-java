package org.example.Decorator;

public class CakeStrawberriesDecorator extends CakeDecorator {

    public CakeStrawberriesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adorning the cake with strawberries..");
    }
}
