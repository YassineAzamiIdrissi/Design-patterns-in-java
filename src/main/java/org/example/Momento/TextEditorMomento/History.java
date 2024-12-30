package org.example.Momento.TextEditorMomento;

import java.util.Stack;

public class History {
    Stack<Momento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        history.pop();
        if (!history.isEmpty()) {
            editor.rollBack(history.getLast());
        }
    }
}
