package com.company.Homeworks.Homework4;

public interface MenuAction {
    void doAction(ContactsService cs,ContactsService file);
    String getName();
    boolean closeAfter();

}
