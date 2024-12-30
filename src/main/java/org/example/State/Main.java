package org.example.State;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl on = new On();

        tv.setState(on);

        tv.pressButton();
    }
}
