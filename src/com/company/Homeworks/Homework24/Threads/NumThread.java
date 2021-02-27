package com.company.Homeworks.Homework24.Threads;

import com.company.Homeworks.Homework24.CommonResource;

import java.io.*;
import java.util.Scanner;

public class NumThread implements Runnable {
    private final File file = new File("D:\\Hillel\\src\\com\\company\\Homeworks\\Homework24\\res\\numbers.txt");
    private CommonResource commonResource;
    public NumThread(CommonResource commonResource){
        this.commonResource=commonResource;
    }

    @Override
    public void run() {
        System.out.println("Поток 2 начал работу");
        try (InputStream in = new BufferedInputStream(new FileInputStream(file))) {
            Scanner scanner = new Scanner(in);
            int count = 0;
            int num = 0;
                while (scanner.hasNextLine()&&count<10) {
                    num+=scanner.nextInt();
                    ++count;
                }
            commonResource.writeInFile("сумма: "+num);
            System.out.println("Поток 2 завершил работу");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
