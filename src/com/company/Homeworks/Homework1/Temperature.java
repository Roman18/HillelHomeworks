package com.company.Homeworks.Homework1;

import java.util.Scanner;

public class Temperature {


    public static double converting(int degree) {
        return ((degree * 9) / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter temperature in celsius:");
            String stringDegree = scanner.nextLine();
            if ((stringDegree.matches("([0-9])+")&&!stringDegree.matches("[0]([0-9])+"))
                    ||stringDegree.matches("([0]){0}")) {

                int degree = Integer.parseInt(stringDegree);
                System.out.println("Temperature in celsius: " + degree);
                System.out.println("Temperature in fahrenheit: " + converting(degree));
                break;

            } else {

                System.out.println("Try again...");

            }
        }
    }
}
