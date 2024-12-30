package org.example.Momento.TextEditorMomento;

public class Main {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        History h = new History();
        te.setText("Yassine");
        h.save(te);

        te.setText("Az");
        h.save(te);

        te.setText("Id");
        h.save(te);

        h.undo(te);

        System.out.println("Current content "+te.getText());
    }
}
