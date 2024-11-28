package org.example.Builder;

public class PersonCardIdBuilder implements Builder {
    private int id;
    private String name;
    private int age;
    private double height;

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Builder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder height(double height) {
        this.height = height;
        return this;
    }

    public PersonIdCard build() {
        return new PersonIdCard(id, name, age, height);
    }
}
