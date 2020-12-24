package com.company.Homeworks.Homework9.Rules;



public class StartWithValidatorRule implements ValidatorRule<String> {
    private String string;
    public StartWithValidatorRule(String string){
        this.string=string;
    }
    @Override
    public boolean validate(String s){

        if (s.startsWith(string)){
            return true;
        }
        return false;

    }

    @Override
    public String errorMessage() {
        return "invalid start";
    }
}
