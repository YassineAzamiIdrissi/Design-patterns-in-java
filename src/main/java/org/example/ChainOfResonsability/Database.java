package org.example.ChainOfResonsability;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        users.put("admin", "password");
        users.put("user", "password");
    }

    public Database(Map<String, String> users) {
        this.users = users;
    }

    public boolean isUserValid(String username) {
        return users.containsKey(username);
    }

    public boolean isPasswordValid(String username, String password) {
        return users.get(username).equals(password);
    }
}
