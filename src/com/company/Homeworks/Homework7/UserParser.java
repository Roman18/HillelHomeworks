package com.company.Homeworks.Homework7;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {


    private User parse(String user) {
        User userObj;
        Pattern pattern=Pattern.compile("(?:([a-zA-Z0-9]+):)?([a-zA-Z0-9]+)(?:@([a-zA-Z0-9]+))?");
        Matcher matcher=pattern.matcher(user);
        if (matcher.matches()){
            if (matcher.group(1)==null){
                    userObj = new User(matcher.group(2), matcher.group(2), matcher.group(3));
            }else {
                userObj=new User(matcher.group(1),matcher.group(2),matcher.group(3));
            }
        }else {
            throw new IllegalArgumentException();
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
