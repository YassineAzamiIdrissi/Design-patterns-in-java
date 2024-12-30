package org.example.Facade;

public class DecorationBuilder {
    private String decoration;

    public DecorationBuilder() {
    }

    public DecorationBuilder(String decoration) {
        this.decoration = decoration;
    }

    public void setDecoration(String decoration) {
        System.out.println("Decoration build : " + decoration);
        this.decoration = decoration;
    }
}
