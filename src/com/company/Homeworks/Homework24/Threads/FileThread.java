package com.company.Homeworks.Homework24.Threads;

import com.company.Homeworks.Homework24.CommonResource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileThread implements Runnable {
    private final File file = new File("D:\\Hillel\\src\\com\\company\\Homeworks\\Homework24\\res\\test.txt");
    private CommonResource commonResource;
    private List<String> storePhone = new ArrayList<>(); // для хранения номеров вытащенных из считанной строки

    public FileThread(CommonResource commonResource){
        this.commonResource=commonResource;
    }
    @Override
    public void run() {
        System.out.println("Поток 3 начал работу");
        try (InputStream in = new BufferedInputStream(new FileInputStream(file))) {
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                parseLine(line);
            }
            String res = String.join(", ", storePhone);
            commonResource.writeInFile("номера: "+res);
            System.out.println("Поток 3 завершил работу");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void parseLine(String line){ // достаём все номера из строки
        String[]lines=line.split(" ");
        for (int i = 0; i <lines.length ; i++) {
            if(lines[i].matches("\\+380[0-9]{9}")){
                storePhone.add(lines[i]);
            }
        }
    }
}
