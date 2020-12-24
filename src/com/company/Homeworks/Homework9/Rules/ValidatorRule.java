package com.company.Homeworks.Homework9.Rules;



public interface ValidatorRule<T> {
    boolean validate(T t);
    String errorMessage();
}
