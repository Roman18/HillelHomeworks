package com.company.Homeworks.Homework24;

import com.company.Homeworks.Homework24.Threads.FibThread;
import com.company.Homeworks.Homework24.Threads.FileThread;
import com.company.Homeworks.Homework24.Threads.NumThread;

public class Main24 {

    public static void main(String[] args) {
        CommonResource cr = new CommonResource();
        Thread fibThread=new Thread(new FibThread(cr));
        Thread numThread=new Thread(new NumThread(cr));
        Thread fileThread = new Thread(new FileThread(cr));
        fibThread.start();
        numThread.start();
        fileThread.start();
        try {
            fibThread.join();
            numThread.join();
            fileThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Все потоки завершили свою работу");
    }
}
