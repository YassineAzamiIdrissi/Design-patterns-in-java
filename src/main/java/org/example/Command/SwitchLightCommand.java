package org.example.Command;

public class SwitchLightCommand implements Command {
    Light light;


    public SwitchLightCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.switchLight();
    }

    public void isLightOn() {
        if (light.getLightState()) {
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }
}
