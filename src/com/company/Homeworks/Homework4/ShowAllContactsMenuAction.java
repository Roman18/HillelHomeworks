package com.company.Homeworks.Homework4;

import java.util.Scanner;

public class ShowAllContactsMenuAction implements MenuAction {
    private Scanner scanner;

    public ShowAllContactsMenuAction(Scanner sc) {
        this.scanner = sc;
    }

    @Override
    public void doAction(ContactsService cs,ContactsService file) { //передаём 2 аргумента для работы в памяти и работы с файлом
        while (true) {
            System.out.println("Contacts from list in memory:");
            System.out.println(cs.getAll());
            System.out.println("Contacts from file:");
            System.out.println(file.getAll());
            if (!closeAfter()){
                break;
            }
        }
    }

    @Override
    public String getName() { // не реализовал т.к. не очень понимаю зачем метод
        return null;
    }

    @Override
    public boolean closeAfter() {//если пользователь хочет повторить операцию пусть вводит Y или y
        System.out.println("Do you want to continue this operation? Y/n");
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
