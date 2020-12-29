package com.company.Homeworks.Homework11;

public class WordCount {


    public MyMap<String, Integer> count(String text, String pattern) {
        checkString(text);
        String[] textArr = changeString(text);
        MyMap<String, Integer> myMap = new MyMap<>();
        int count;
        for (int i = 0; i < textArr.length; i++) {
            if (checkSign(textArr[i], pattern)) {
                textArr[i] = textArr[i].replaceAll("[^0-9а-яa-z]+", "");
            }
            if (myMap.containsKey(textArr[i])) {
                count = myMap.get(textArr[i]) + 1;
                myMap.put(textArr[i], count);
            } else {
                myMap.put(textArr[i], 1);
            }
        }

        return myMap;
    }

    private String[] changeString(String text) {
        return text.toLowerCase().
                split(" ");
    }

    private boolean checkSign(String text, String pattern) {
        return text.matches(pattern);
    }

    private void checkString(String text) {
        if (text.matches("[ ]*")) {
            throw new IllegalArgumentException("String is Empty");
        }
    }
}
