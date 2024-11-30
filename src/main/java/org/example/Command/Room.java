package org.example.Command;

public class Room {
    Command command;

    public Room() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    protected void executeCommand() {
        command.execute();
    }

    protected Command getCommand() {
        return command;
    }
}
