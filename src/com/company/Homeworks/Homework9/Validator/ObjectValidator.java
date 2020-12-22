package com.company.Homeworks.Homework9.Validator;


import com.company.Homeworks.Homework9.ValidationException;

public interface ObjectValidator <T> {
    void validator(T t) throws ValidationException;
}
