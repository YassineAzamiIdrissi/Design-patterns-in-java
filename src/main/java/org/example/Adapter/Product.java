package org.example.Adapter;

public class Product {
    private double price;
    PaymentProcessor paymentProcessor;


    public Product() {}

    public Product(double price, PaymentProcessor paymentProcessor) {
        this.price = price;
        this.paymentProcessor = paymentProcessor;
    }

    public void buy() {
        paymentProcessor.processPayment(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}
