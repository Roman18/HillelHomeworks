package com.company.Homeworks.Homework6.IP;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {


    public List<String> getListOfIP(String text){
        Pattern p=Pattern.compile("(\\d{1,3}[.]){3}\\d{1,3}");
        Matcher matcher=p.matcher(text);
        List<String> list=new ArrayList<>();
        while (matcher.find()){
list.add(matcher.group());
        }
        return list;
    }
}
