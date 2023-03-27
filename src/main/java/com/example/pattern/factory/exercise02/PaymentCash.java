package com.example.pattern.factory.exercise02;

import org.springframework.stereotype.Service;

@Service("Cash")
public class PaymentCash implements PaymentService{
    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount() + " paid successfully using " + request.getPaymentMethod();
    }
}
