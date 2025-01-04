package com.github.zim0101.designpatterns.strategy;

import java.util.logging.Logger;

public class SEPAPayment implements PaymentStrategy {

    private static final Logger logger = Logger.getLogger(SEPAPayment.class.getName());

    @Override
    public void processPayment(double amount) {
        logger.info("Processing $: " + amount + " via SEPA");
    }
}
