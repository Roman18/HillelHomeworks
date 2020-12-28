package com.company.Homeworks.Homework9.Rules;



public class StartWithValidatorRule implements ValidatorRule<String> {
    private String string;
    public StartWithValidatorRule(String string){
        this.string=string;
    }
    @Override
    public boolean validate(String s){
            return s.startsWith(string);
    }

    @Override
    public String errorMessage() {
        return "invalid start";
    }
}
