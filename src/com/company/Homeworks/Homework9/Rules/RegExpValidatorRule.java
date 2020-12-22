package com.company.Homeworks.Homework9.Rules;

import com.company.Homeworks.Homework9.ValidationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule implements ValidatorRule {

    private Pattern pattern;
    public RegExpValidatorRule(Pattern pattern){
        this.pattern=pattern;
    }
    @Override
    public boolean validate(Object o) throws ValidationException {
        String input=(String) o;
        Matcher matcher=pattern.matcher(input);
        if (matcher.find()){
            return true;
        }else {

            throw new ValidationException(errorMessage());
        }

    }

    @Override
    public String errorMessage() {
        return "invalid phone number";
    }
}
