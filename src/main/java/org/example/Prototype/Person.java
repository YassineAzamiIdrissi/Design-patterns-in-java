package org.example.Prototype;

public class Person implements Prototype {
    private String name;
    private int age;
    private String gender;
    private String phone;

    public Person() {}

    public Person(Person p1) {
        this.name = p1.name;
        this.age = p1.age;
        this.gender = p1.gender;
        this.phone = p1.phone;
    }

    @Override
    public Prototype clone_() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person created";
    }
}
