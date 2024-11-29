package org.example.ChainOfResonsability;

public class UserExistsHandler extends Handler {
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isUserValid(username)) {
            System.out.println("user not found");
            System.out.println("sign up now..");
            return false;
        }
        return handleNext(username, password);
    }
}
