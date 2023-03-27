package com.example.pattern.factory.exercise02;

public interface PaymentServiceFactory {

    public PaymentService getService(String serviceName);

}
