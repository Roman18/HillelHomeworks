package com.company.Homeworks.Homework7;


import java.util.ArrayList;
import java.util.List;

public class UserParser {


    private User parse(String user) {
        User userObj;
        String users[];
        if (user.matches("(.)+[:][ ]*[@](.)+")) {
            throw new IllegalArgumentException();
        } else if (user.matches("(.)+[:](.)+[@](.)+")) {
            users = user.split("[:]|[@]");
            userObj = new User(users[0], users[1], users[2]);
        } else if (user.matches("(.)+[@](.)+")) {
            users = user.split("@");
            userObj = new User(users[0], users[0], users[1]);
        } else if (user.matches("(.)+[:](.)+")) {
            users = user.split(":");
            userObj = new User(users[0], users[1], null);
        } else {
            userObj = new User(user, user, null);
        }

        return userObj;
    }

    public List<User> parseList(String user) {
        String[] users = user.split(",");
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < users.length; i++) {
            userList.add(parse(users[i]));
        }
        return userList;
    }
}
