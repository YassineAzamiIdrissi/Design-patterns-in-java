package org.example.Momento;

public class Originator {
    private String state;
    private Momento momento;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present : " +state);
    }

    public Momento originatorMomento() {
        momento = new Momento(state);
        return momento;
    }

    public void revert(Momento caredMomento) {
        state = caredMomento.getState();
    }
}
