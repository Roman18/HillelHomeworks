package com.company.Homeworks.Homework4;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }

    @Override
    public String toString() {
        return name+" "+phone;
    }
}
