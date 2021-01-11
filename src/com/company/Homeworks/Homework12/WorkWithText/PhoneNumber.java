package com.company.Homeworks.Homework12.WorkWithText;

import java.util.Objects;

public class PhoneNumber {
    private String number;
    private int count;
    public PhoneNumber (String number){
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null||getClass()!=obj.getClass()){return false;}
        PhoneNumber phoneNumber=(PhoneNumber) obj;
        if (number.equals(phoneNumber.getNumber())){
            phoneNumber.count++;
            return number.equals(phoneNumber.getNumber());
        }
        return false;
    }
    @Override
    public String toString() {
        return number;
    }
}
