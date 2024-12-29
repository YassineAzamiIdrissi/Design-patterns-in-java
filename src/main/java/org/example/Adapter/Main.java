package org.example.Adapter;

public class Main {
    public static void main(String[] args) {
        Product hoodie = new Product();

        hoodie.setPrice(150);
        hoodie.setPaymentProcessor(new PaymentAdapter(new PayFastGateway()));

        hoodie.buy();
    }
}
