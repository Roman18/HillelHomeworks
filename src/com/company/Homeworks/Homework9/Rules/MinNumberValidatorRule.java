package com.company.Homeworks.Homework9.Rules;

import com.company.Homeworks.Homework9.ValidationException;

public class MinNumberValidatorRule implements ValidatorRule {
    private Number number;
    public MinNumberValidatorRule(Number number){
        this.number=number;
    }
    @Override
    public boolean validate(Object o)throws ValidationException {
        Number arg=(Number) o;
        if (number.intValue()<arg.intValue()){
            return true;
        }else{

            throw new ValidationException(errorMessage());
        }
    }

    @Override
    public String errorMessage() {
        return "the argument is less than the minimum value";
    }
}
