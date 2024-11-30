package org.example.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        FormBuilder genBuilder = new LoginFormBuilder();
        genBuilder.buildPage();
        System.out.println("......");
        genBuilder = new SignUpFormBuilder();
        genBuilder.buildPage();
    }
}
