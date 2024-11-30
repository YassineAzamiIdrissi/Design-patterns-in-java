package org.example.Command;

public class Main {
    public static void main(String[] args) {
        Room room = new LivingRoom();
        Command lightCommand = new SwitchLightCommand();
        room.setCommand(lightCommand);
        room.executeCommand();
        if (room.getCommand() instanceof SwitchLightCommand) {
            ((SwitchLightCommand) room.getCommand()).isLightOn();
        }
    }
}
