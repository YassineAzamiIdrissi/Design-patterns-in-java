package org.example.Observer;

public interface Subject {
    void add(CustomObserver o);
    void remove(CustomObserver o);
    void notifyAllObservers();
}
