package org.example.Iterator;

public interface Iterator {
    void first();

    boolean isLast();

    String getCurrentItem();

    String moveToNext();

    String add(String student);
}
