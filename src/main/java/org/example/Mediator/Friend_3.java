package org.example.Mediator;

public class Friend_3 extends Friend {
    public Friend_3() {
        super();
    }
    public void send(String message) {
        this.mediator.sendMessage(this, message);
    }

    public void notify_(String message) {
        System.out.println("Boss notified by : '" + message + "'");
    }
}
