package com.company.Homeworks.Homework6.ExtendingHomework4;

public interface ContactService {
    ContactsList getAll();
    void remove(String name);
    void add(Contact c);
    void searchByName(String name);
    void searchByPhone(String number);
}
