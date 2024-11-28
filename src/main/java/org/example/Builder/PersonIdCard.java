package org.example.Builder;

public class PersonIdCard {
    private int id;
    private String name;
    private int age;
    private double height;

    public PersonIdCard(int id, String name, int age, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonIdCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
