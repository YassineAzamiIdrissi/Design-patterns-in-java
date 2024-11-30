package org.example.TemplateMethod;

public interface FormBuilder {

    default void buildPage() { // template method
        buildMenu();
        buildInputs();
        buildButtons();
        buildFooter();
    }

    void buildMenu();

    void buildInputs();

    void buildButtons();

    default void buildFooter() {
        System.out.println("website footer");
    }

}
