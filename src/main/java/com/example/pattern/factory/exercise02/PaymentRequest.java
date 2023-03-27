package com.example.pattern.factory.exercise02;

import lombok.Data;

@Data
public class PaymentRequest {
    private long amount;
    private String paymentMethod;
}
