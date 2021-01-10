package com.company.Homeworks.Homework12.WorkWithText;

import java.util.HashMap;
import java.util.Map;

public class WorkText {



    public Map<String,Integer> getNumbers(String text){
        System.out.println(text);
        String[] array = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("(\\+380)[0-9]{9}") || array[i].matches("(0)([0-9]){9}")) {
                if (array[i].matches("(0)([0-9]){9}")){
                    array[i]="+38"+array[i];
                }
                if (map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i]) + 1);
                } else {
                    map.put(array[i], 1);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println("Phone numbers:");
        String text = "+380987566361 0987566364 +370957666364 +380965535881 0987566364 0987566361 0987666363";
        WorkText wt=new WorkText();
        Map<String,Integer> map=wt.getNumbers(text);
        System.out.println("Unique phone numbers");
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                System.out.println(s);
            }
        }
    }
}
