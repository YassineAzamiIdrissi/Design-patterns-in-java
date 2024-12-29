package org.example.Decorator;

public abstract class CakeDecorator extends Cake {
    Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void prepare() {
        if (cake == null) {
            System.out.println("NULL OBJECT......");
            return;
        }
        cake.prepare();
    }
}
