package org.example.Strategy;

public class SecondChoice implements IChoice {

    @Override
    public void selectChoice(int a, int b) {
        System.out.println("second choice selected");
        System.out.println("concatenating the numbers " + a + b);
    }
}
