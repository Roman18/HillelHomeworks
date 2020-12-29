package com.company.Homeworks.Homework11;


public class Run {


    public static void main(String[] args) {
        String text = "Я иду по парку, иду один и вижу как по воде пробегает луч солнца";
        String pattern = "([0-9а-яa-z]+)([^0-9а-яa-z]+)";
        WordCount wordCount = new WordCount();
        MyMap<String, Integer> myMap = wordCount.count(text, pattern);
        for (MyMap.Pair<String, Integer> pair :
                myMap.pairSet()) {
            System.out.println("Word: " + pair.getKey() + "; Count: " + pair.getValue());
        }


    }
}
