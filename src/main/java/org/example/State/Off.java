package org.example.State;

public class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV tv) {
        System.out.println("ON --> OFF");
        tv.setState(new Off());
    }
}
