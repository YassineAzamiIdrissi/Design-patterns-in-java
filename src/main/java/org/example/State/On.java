package org.example.State;

public class On extends RemoteControl {
    @Override
    public void pressSwitch(TV tv) {
        System.out.println("OFF --> ON");
        tv.setState(new On());
    }
}
