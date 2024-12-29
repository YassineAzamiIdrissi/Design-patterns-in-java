package org.example.Strategy;

public class Context {
    private IChoice choice;

    public void setChoice(IChoice choice) {
        this.choice = choice;
    }

    public void showChoice(int a, int b) {
        choice.selectChoice(a, b);
    }
}
