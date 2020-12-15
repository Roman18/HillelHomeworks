package com.company.Homeworks.Homework7;

public class Start {
    public static void main(String[] args) {
        String text = "user1:name1@qwerty,name2,name3@password,nick:name4,vasia:@trulala"; //последний пользователь не валидный
        UserParser userParser = new UserParser();
        try {
            System.out.println(userParser.parseList(text));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid arg...");
        }

    }
}
