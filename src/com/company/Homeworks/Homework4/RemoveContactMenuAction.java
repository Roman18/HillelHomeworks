package com.company.Homeworks.Homework4;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {

    private Scanner scanner;

    public RemoveContactMenuAction(Scanner sc) {
        this.scanner = sc;
    }

    @Override
    public void doAction(ContactsService cs,ContactsService file) {//передаём 2 аргумента для работы в памяти и работы с файлом
        while (true) {
            System.out.println("Please, enter name:");
            String name = scanner.next();
            cs.remove(name);
            file.remove(name);
            if (!closeAfter()) {
                break;
            }
        }
    }

    @Override
    public String getName() {// не реализовал т.к. не очень понимаю зачем метод
        return null;
    }

    @Override
    public boolean closeAfter() {//если пользователь хочет повторить операцию пусть вводит Y или y
        System.out.println("Do you want continue this operation? Y/n");
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
