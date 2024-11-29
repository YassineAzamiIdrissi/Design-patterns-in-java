package org.example.ChainOfResonsability;

public class AuthenticationService {
    Handler handler;

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    public void loginUser(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Nicely done you are now logged in...");
        } else {
            System.out.println("Something went wrong");
        }
    }
}

