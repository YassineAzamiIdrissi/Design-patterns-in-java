package org.example.ChainOfResonsability;

public class PageServerHandler extends Handler {
    private Database database;

    public PageServerHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (username.equals("user")) {
            System.out.println("this is a user page");
        } else {
            System.out.println("this is an admin page");
        }
        return handleNext(username, password);
    }
}
