package org.example.AbstractFactory;

public class AwayFactory extends AbstractFactory {

    @Override
    public Stadium createStadium() {
        return new AwayStadium();
    }

    @Override
    public Kit createKit() {
        return new AwayKit();
    }
}
