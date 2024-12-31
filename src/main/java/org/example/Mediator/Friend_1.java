package org.example.Mediator;

public class Friend_1 extends Friend {
    public Friend_1() {
        super();
    }

    public void send(String message) {
        this.mediator.sendMessage(this, message);
    }

    public void notify_(String message) {
        System.out.println("friend_1 received " + message);
    }
}
