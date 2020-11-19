package com.company.Homeworks.Homework1;

import java.util.Scanner;

public class Additional {


    public static int account(int num) {

        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num = (num - remainder) / 10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your number:");
            String stringForVerify = scanner.nextLine();
            if (stringForVerify.matches("([0-9]){4}")&&!stringForVerify.matches("[0]([0-9]){3}")) {
                int num = Integer.parseInt(stringForVerify);
                System.out.println("Sum of your number: " + account(num));
                break;
            } else {
                System.out.println("Try again...");
            }
        }
    }

}
