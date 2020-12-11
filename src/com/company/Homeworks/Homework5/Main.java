package com.company.Homeworks.Homework5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Menu menu=new Menu(scanner);
menu.addAction(new CesarCryptMenuAction(scanner));
menu.addAction(new CesarDecryptMenuAction(scanner));
menu.addAction(new XORCryptMenuAction(scanner));
menu.addAction(new XORDecryptMenuAction(scanner));
        menu.run();
    }
}
