package com.company.Homeworks.Homework9.Rules;

import com.company.Homeworks.Homework9.ValidationException;

public class StartWithValidatorRule implements ValidatorRule {
    private String string;
    public StartWithValidatorRule(String string){
        this.string=string;
    }
    @Override
    public boolean validate(Object o) throws ValidationException {
        String input = (String) o;
        if (input.startsWith(string)){
            return true;
        }else {
            throw new ValidationException(errorMessage());
        }

    }

    @Override
    public String errorMessage() {
        return "invalid start";
    }
}
