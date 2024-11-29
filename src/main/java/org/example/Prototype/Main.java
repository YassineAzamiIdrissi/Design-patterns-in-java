package org.example.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            if (i % 2 == 0) {
                people.add(new Student());
            } else {
                people.add(new Person());
            }
        }

        List<Prototype> clonedList = new ArrayList<>();
        for (Person p : people) {
            clonedList.add(p.clone_());
        }
        for (Prototype p : clonedList) {
            System.out.println(p);
        }
    }
}
