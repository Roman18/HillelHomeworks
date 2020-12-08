package com.company.Homeworks.Homework4;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 - Show list");
        System.out.println("2 - Add contact");
        System.out.println("3 - Remove contact");
        System.out.println("4 - Exit");
        Menu menu=new Menu();
        menu.addAction(new ShowAllContactsMenuAction(scanner));
        menu.addAction(new AddContactMenuAction(scanner));
        menu.addAction(new RemoveContactMenuAction(scanner));
        int choose;
        label:while (true){
            System.out.println("Please, enter code of item:");
            choose=scanner.nextInt();
            switch (choose){
                case 1: case 2: case 3:
                    menu.run(choose-1);
                    break;
                case 4:
                    System.out.println("Good bye :)");
                    break label;
                default:
                    System.out.println("Try again...");
            }
            }
        }
    }

