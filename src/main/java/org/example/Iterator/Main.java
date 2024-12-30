package org.example.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] students = new String[0];
        Branch cs = new ComputerEngineering(students);
        Branch m = new MechanicalEngineering();

        // Iterator m_iterator = new MechanicalBranchIterator(new LinkedList<>());
        // m_iterator.add("Achraf");
        // m_iterator.add("Yassine");
        // print(m_iterator);
        Iterator s_iterator = cs.getIterator();
        s_iterator.add("yassine");
        s_iterator.add("yassine");
        s_iterator.add("yassine");
        s_iterator.add("yassine");
        print(s_iterator);
    }

    public static void print(Iterator iterator) {
        while (!iterator.isLast()) {
            System.out.println(iterator.moveToNext());
        }
    }
}
