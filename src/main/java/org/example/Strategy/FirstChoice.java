package org.example.Strategy;

public class FirstChoice implements IChoice {

    @Override
    public void selectChoice(int a, int b) {
        System.out.println("first choice selected :: ");
        System.out.println("adding the two numbers : " + (a + b));
    }
}
