package com.company.Homeworks.Homework24;

import com.company.Homeworks.Homework24.Threads.FibThread;
import com.company.Homeworks.Homework24.Threads.FileThread;
import com.company.Homeworks.Homework24.Threads.NumThread;

public class Main24 {

    public static void main(String[] args) {
        Thread fibThread=new Thread(new FibThread());
        Thread numThread=new Thread(new NumThread());
        Thread fileThread = new Thread(new FileThread());
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
