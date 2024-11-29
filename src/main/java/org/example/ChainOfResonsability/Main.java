package org.example.ChainOfResonsability;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Handler handler = new UserExistsHandler(db);
        handler.setHandler(new ValidPasswordHandler(db)).
                setHandler(new PageServerHandler(db));

        AuthenticationService service = new AuthenticationService(handler);
        service.loginUser("user", "password");

    }
}
