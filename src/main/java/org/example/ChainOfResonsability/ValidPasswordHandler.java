package org.example.ChainOfResonsability;

public class ValidPasswordHandler extends Handler {

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isPasswordValid(username, password)) {
            System.out.println("username or password is incorrect");
            return false;
        }
        return handleNext(username, password);
    }
}
