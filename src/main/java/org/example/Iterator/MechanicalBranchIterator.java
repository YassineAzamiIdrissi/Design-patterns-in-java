package org.example.Iterator;

import java.util.List;

public class MechanicalBranchIterator implements Iterator {

    List<String> students;
    int position = 0;

    public MechanicalBranchIterator(List<String> students) {
        this.students = students;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public boolean isLast() {
        return position == students.size();
    }

    @Override
    public String getCurrentItem() {
        return students.get(position);
    }

    @Override
    public String moveToNext() {
        return students.get(position++);
    }

    @Override
    public String add(String student) {
        students.add(student);
        return students.getLast();
    }
}
