package org.example.Adapter;

public class PayFastGateway {
    public void makePayment(String currency, double amount) {
        System.out.println("Payment of " + amount + " " + currency + " processed via PayFast.");
    }
}

