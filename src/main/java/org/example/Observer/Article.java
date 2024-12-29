package org.example.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Article extends Observable implements Subject {
    private final List<CustomObserver> observers = new ArrayList<>();
    private double price;

    public Article(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        // notifyAllObservers();
        setChanged();
        notifyObservers(price);
    }

    @Override
    public void add(CustomObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(CustomObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(o -> o.update(price));
    }

    public void plusCher() {
        price++;
        // notifyAllObservers();
        setChanged();
        notifyObservers(price);
    }

    public void moinsCher() {
        price--;
        // notifyAllObservers();
        setChanged();
        notifyObservers(price);
    }
}
