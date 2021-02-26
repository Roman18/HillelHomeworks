package com.company.Homeworks.Homework24.Threads;

import com.company.Homeworks.Homework24.CommonResource;



public class FibThread implements Runnable {
    private CommonResource commonResource=new CommonResource();
    @Override
    public void run() {
        System.out.println("Поток 1 начал работу");
        int first = 0;
        int second = 1;
        int count = 0;
        while (count<13){
            int temp = second;
            second = second + first;
            first = temp;
            ++count;
        }
        commonResource.writeInFile("фибоначи: "+second);
        System.out.println("Поток 1 завершил работу");

    }
}
