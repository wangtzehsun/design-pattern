package com.example.pattern.factory.exercise02.config;

public class BusinessException extends RuntimeException{
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
