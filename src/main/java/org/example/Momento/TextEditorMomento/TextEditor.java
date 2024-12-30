package org.example.Momento.TextEditorMomento;

public class TextEditor {
    private String text;
    private Momento textMomento;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Momento save() {
        textMomento = new Momento(text);
        return textMomento;
    }

    public void rollBack(Momento textMomento) {
        text = textMomento.getText();
    }
}
