package org.example.Builder;

public class PersonBuilder implements Builder {
    private int id;
    private String name;
    private int age;
    private double height;

    public PersonBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder height(double height) {
        this.height = height;
        return this;
    }

    public Person build() {
        return new Person(id, name, age, height);
    }
}
