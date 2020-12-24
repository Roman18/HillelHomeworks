package com.company.Homeworks.Homework9.Rules;

public class MinNumberValidatorRule implements ValidatorRule<Number> {
    private Number number;

    public MinNumberValidatorRule(Number number) {
        this.number = number;
    }

    @Override
    public boolean validate(Number n) {
        if (number.intValue() < n.intValue()) {
            return true;
        }
        return false;
    }

    @Override
    public String errorMessage() {
        return "the argument is less than the minimum value";
    }
}
