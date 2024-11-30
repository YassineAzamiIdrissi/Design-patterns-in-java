package org.example.Command;

public class Light {
    private boolean isLightOn;

    public void switchLight() {
        isLightOn = !isLightOn;
    }

    public boolean getLightState() {
        return isLightOn;
    }
}
