package com.company.Homeworks.Homework23.Chain.Exception;

public class OrderException extends RuntimeException {
    public OrderException() {

    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }
}
