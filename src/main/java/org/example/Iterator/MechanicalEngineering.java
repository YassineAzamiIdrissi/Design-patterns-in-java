package org.example.Iterator;

import java.util.LinkedList;

public class MechanicalEngineering implements Branch {
    LinkedList<String> students = new LinkedList<>();

    @Override
    public Iterator getIterator() {
        return new MechanicalBranchIterator(students);
    }
}
