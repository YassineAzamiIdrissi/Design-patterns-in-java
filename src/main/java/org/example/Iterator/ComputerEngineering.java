package org.example.Iterator;

public class ComputerEngineering implements Branch {
    String[] students;

    public ComputerEngineering(int size) {
        students = new String[size];
    }

    public ComputerEngineering(String[] students) {
        this.students = students;
    }

    @Override
    public Iterator getIterator() {
        return new ComputerBranchIterator(students);
    }
}
