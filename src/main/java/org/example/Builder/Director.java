package org.example.Builder;

public class Director {
    public void createUnknown(Builder builder) {
        builder.name("unknown");
        builder.age(0);
    }
}
