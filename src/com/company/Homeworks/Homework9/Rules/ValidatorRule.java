package com.company.Homeworks.Homework9.Rules;

import com.company.Homeworks.Homework9.ValidationException;

public interface ValidatorRule<T> {
    boolean validate(T t) throws ValidationException;
    String errorMessage();
}
