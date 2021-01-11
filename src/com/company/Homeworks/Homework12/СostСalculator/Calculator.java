package com.company.Homeworks.Homework12.СostСalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {


    public void calculate() {

        Scanner scanner = new Scanner(System.in);
        String variant;
        Map<String, Integer> incomeMap = new HashMap<>();
        Map<String, Integer> consMap = new HashMap<>();
        String[] array;
        System.out.println("Create list:\nType 'END' if you want stop process");
        while (true) {
            variant = scanner.nextLine();
            if (variant.matches("[+\\-][0-9]+ (.)+") || variant.equals("END")) {
                if (variant.equals("END")) {
                    break;
                }
                Map<String, Integer> targetMap = variant.startsWith("+") ? incomeMap : consMap;
                array = variant.split(" ", 2);
                if (targetMap.containsKey(array[1])) {
                    targetMap.put(array[1], targetMap.get(array[1]) + Integer.parseInt(array[0]));
                } else {
                    targetMap.put(array[1], Integer.parseInt(array[0]));
                }

            } else {
                System.out.println("Invalid input\nTry again...");
            }
        }

        int income = 0;
        int cons = 0;
        for (Integer value : incomeMap.values()) {
            income += value;
        }
        for (Integer value : consMap.values()) {
            cons += value;
        }
        System.out.println("Расходы составляют " + (-cons) + " из которых:");

        for (String s : consMap.keySet()) {
            System.out.println(s + ": " + (-consMap.get(s)));
        }
        System.out.println("Доходы составляют " + income + " из которых:");
        for (String s : incomeMap.keySet()) {
            System.out.println(s + ": " + incomeMap.get(s));
        }
        System.out.println("Общий доход: " + (income + cons));


    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
    }


}
