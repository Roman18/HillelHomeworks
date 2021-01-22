package com.company.Homeworks.Homework9;

import com.company.Homeworks.Homework9.Rules.*;
import com.company.Homeworks.Homework9.Validator.ObjectValidator;
import com.company.Homeworks.Homework9.Validator.RulesBasedObjectValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        List<ValidatorRule> list = new ArrayList<>();
        list.add(new MaxNumberValidatorRule(10));
        list.add(new MinNumberValidatorRule(0));
        ObjectValidator<Number> objectValidatorNumber = new RulesBasedObjectValidator<>(list);
        try {
            objectValidatorNumber.validator(5);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        list = new ArrayList<>();
        list.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{10}")));
        list.add(new StartWithValidatorRule("+3809"));
        ObjectValidator<String> objectValidatorString = new RulesBasedObjectValidator<>(list);
        try {
            objectValidatorString.validator("+3809766361");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
