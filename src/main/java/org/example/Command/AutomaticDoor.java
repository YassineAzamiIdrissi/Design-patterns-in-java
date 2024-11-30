package org.example.Command;

public class AutomaticDoor {
    private boolean isOpened;

    private void open() {
        if (!isOpened) {
            isOpened = true;
        }
    }

    private void close() {
        if (isOpened) {
            isOpened = false;
        }
    }

    public void moveDoor() {
        if (!isOpened) {
            open();
        } else {
            close();
        }
    }

    public boolean getDoorState() {
        return isOpened;
    }
}
