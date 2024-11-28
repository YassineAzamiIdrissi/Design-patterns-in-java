package org.example.AbstractFactory;

public class HomeFactory extends AbstractFactory {
    @Override
    public Stadium createStadium() {
        return new HomeStadium();
    }

    @Override
    public Kit createKit() {
        return new HomeKit();
    }
}
