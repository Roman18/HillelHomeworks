package com.company.Homeworks.Homework6.ExtendingHomework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Menu menu =new Menu(scanner);
        ContactService cs=new InMemoryContactsService();
        menu.addAction(new AddContactMenuAction(scanner,cs));
        menu.addAction(new RemoveContactMenuAction(scanner,cs));
        menu.addAction(new ShowAllContactsMenuAction(scanner,cs));
        menu.addAction(new SearchByNameMenuAction(scanner,cs));
        menu.addAction(new SearchByPhoneMenuAction(scanner,cs));
        menu.run();

    }
}
