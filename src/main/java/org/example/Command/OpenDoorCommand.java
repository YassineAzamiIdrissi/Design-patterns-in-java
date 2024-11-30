package org.example.Command;

public class OpenDoorCommand implements Command {
    AutomaticDoor door;

    public OpenDoorCommand() {
        this.door = new AutomaticDoor();
    }

    @Override
    public void execute() {
        door.moveDoor();
    }

    public void isDoorOpen() {
        if (door.getDoorState()) {
            System.out.println("Door is open");
        } else {
            System.out.println("Door is closed");
        }
    }
}
