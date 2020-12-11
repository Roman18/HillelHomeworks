package com.company.Homeworks.Homework5;

import java.util.Scanner;

public class XORCryptMenuAction implements MenuAction {
    private Scanner scanner;
    public XORCryptMenuAction(Scanner scanner){
        this.scanner=scanner;
    }
    @Override
    public void doAction() {
        while (true) {
            System.out.println("Enter your text:");
            String text = scanner.nextLine();
            String newText = new StringCrypter(new XorSymbolCrypter()).crypt(text);
            System.out.println(newText);
            if (!closeAfter()){
                break;
            }
        }
    }

    @Override
    public String getName() {
        return "Xor Crypt";
    }

    @Override
    public boolean closeAfter() {
        System.out.println("Do you want continue this operation? Y/n");
        String answer = scanner.next();
        if (answer.equals("y") || answer.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
