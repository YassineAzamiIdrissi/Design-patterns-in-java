package org.example.ChainOfResonsability;

public abstract class Handler {
    private Handler next;

    public Handler setHandler(Handler handler) {
        this.next = handler;
        return next;
    }

    // this mthd does the following : if this handler has a successor then
    // the mission will be delegated to this latter...
    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

    public abstract boolean handle(String username, String password);
}
