package org.example.TemplateMethod;

public class SignUpFormBuilder implements FormBuilder {

    @Override
    public void buildMenu() {
        System.out.println("create a new account");
    }

    @Override
    public void buildInputs() {
        System.out.println("first name");
        System.out.println("last name");
        System.out.println("username");
        System.out.println("email");
        System.out.println("password");
    }

    @Override
    public void buildButtons() {
        System.out.println("create an account");
        System.out.println("I already have an account.. login");
    }

}
