package com.github.zim0101.designpatterns.strategy;

import java.util.logging.Logger;

public class StripePayment implements PaymentStrategy {

    private static final Logger logger = Logger.getLogger(StripePayment.class.getName());

    @Override
    public void processPayment(double amount) {
        // payment related validations
        // payment related api calls
        // payment related business logic
        // payment related database operations
        logger.info("Processing $: " + amount + " via Stripe");
    }
}
