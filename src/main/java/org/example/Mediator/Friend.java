package org.example.Mediator;

public abstract class Friend {
    protected FriendMediator mediator;

    public Friend() {
        this.mediator = new ConcreteFriendMediator();
    }

    public void setMediator(FriendMediator mediator) {
        this.mediator = mediator;
    }
}
