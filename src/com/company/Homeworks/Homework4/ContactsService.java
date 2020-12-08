package com.company.Homeworks.Homework4;

public interface ContactsService {
    ContactsList getAll();
    void remove(String name);
    void add(Contact c);

}
