package org.example.Mediator;

public class Friend_2 extends Friend {

    public Friend_2() {
        super();
    }
    public void send(String message) {
        this.mediator.sendMessage(this, message);
    }

    public void notify_(String message) {
        System.out.println("friend_2 received "+message);
    }
}
