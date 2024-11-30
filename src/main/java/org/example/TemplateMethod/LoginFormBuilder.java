package org.example.TemplateMethod;

public class LoginFormBuilder implements FormBuilder {

    @Override
    public void buildMenu() {
        System.out.println("login now");
    }

    @Override
    public void buildInputs() {
        System.out.println("email");
        System.out.println("password");
    }

    @Override
    public void buildButtons() {
        System.out.println("connect");
        System.out.println("I don't have an account.. sign up now");
    }
}
