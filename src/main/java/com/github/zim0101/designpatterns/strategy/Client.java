package com.github.zim0101.designpatterns.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new StripePayment());
        paymentProcessor.process(10);

        paymentProcessor.setPaymentStrategy(new SEPAPayment());
        paymentProcessor.process(12);

        paymentProcessor.setPaymentStrategy(new PaypalPayment());
        paymentProcessor.process(15);
    }
}
