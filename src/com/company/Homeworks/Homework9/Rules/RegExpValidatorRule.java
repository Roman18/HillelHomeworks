package com.company.Homeworks.Homework9.Rules;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule implements ValidatorRule<String>{

    private Pattern pattern;
    public RegExpValidatorRule(Pattern pattern){
        this.pattern=pattern;
    }
    @Override
    public boolean validate(String s){
        Matcher matcher=pattern.matcher(s);
        return matcher.find();

    }

    @Override
    public String errorMessage() {
        return "invalid phone number";
    }
}
