package org.example.Adapter;

public class PaymentAdapter implements PaymentProcessor {
    PayFastGateway fastProcessor;

    public PaymentAdapter(PayFastGateway fastProcessor) {
        this.fastProcessor = fastProcessor;
    }

    // we can use an inheritance (of PayFastGateway) instead of a composition and
    // in this situation tha adapter becomes Structural/Class

    @Override
    public void processPayment(double amount) {
        fastProcessor.makePayment("$", amount);
    }
}
