package com.company.Homeworks.Homework9.Rules;



public class MaxNumberValidatorRule implements ValidatorRule<Number> {
    private Number number;
    public MaxNumberValidatorRule(Number number){
        this.number=number;
    }
    @Override
    public boolean validate(Number n){

        if (number.intValue()>n.intValue()){
return true;
        }
        return false;
    }


    @Override
    public String errorMessage() {
        return "the argument is greater than the maximum value";
    }
}
