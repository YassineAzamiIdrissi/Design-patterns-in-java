package org.example.Prototype;

public class Student extends Person {
    private int level;
    private String school;

    public Student() {}

    public Student(Student p1) {
        super(p1);
        this.level = p1.level;
        this.school = p1.school;
    }

    @Override
    public Prototype clone_() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student created";
    }
}
