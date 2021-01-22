package com.company.Homeworks.Homework12.WorkWithText;

import java.util.*;
import java.util.stream.Collectors;

public class WorkText {



    public Set<PhoneNumber> getNumbers(String text){
        System.out.println(text);
        String[] array = text.split(" ");
        Set<PhoneNumber> set=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("(\\+380)[0-9]{9}") || array[i].matches("(0)([0-9]){9}")) {
                if (array[i].matches("(0)([0-9]){9}")){
                    array[i]="+38"+array[i];
                }
                PhoneNumber phoneNumber=new PhoneNumber(array[i]);
                if (set.contains(phoneNumber)) {
                    set.add(phoneNumber);
                } else {
                    set.add(phoneNumber);
                }
            }
        }
        return set.
                stream().
                filter(s->s.getCount()==0).
                collect(Collectors.toSet());
    }


    public static void main(String[] args) {
        System.out.println("Phone numbers:");
        String text = "+380987566361 0987566364 +370957666364 +380965535881 0987566364 0987566361 0987666363";
        WorkText wt=new WorkText();
        Set<PhoneNumber> set=wt.getNumbers(text);
        System.out.println("Unique phone numbers");
        for (PhoneNumber phoneNumber : set) {
                System.out.println(phoneNumber);
        }
    }
}
