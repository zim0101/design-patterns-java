package com.github.zim0101.designpatterns.strategy;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double amount) {
        paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
