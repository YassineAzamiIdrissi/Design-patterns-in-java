package org.example.Iterator;

public class ComputerBranchIterator implements Iterator {
    String[] students;
    int position = 0;

    public ComputerBranchIterator(String[] students) {
        this.students = students;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public boolean isLast() {
        return position == students.length;
    }

    @Override
    public String getCurrentItem() {
        return students[position];
    }

    @Override
    public String moveToNext() {
        return students[position++];
    }

    @Override
    public String add(String student) {
        String[] newStudents = new String[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = student;
        students = newStudents;
        return students[newStudents.length - 1];
    }
}
