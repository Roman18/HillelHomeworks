package com.company.Homeworks.Homework24;

import java.io.*;

public class CommonResource {
    private final File file =new File("res\\out.txt");


    public synchronized void writeInFile(String text){// общий ресурс для потоков
        try (OutputStream os =new BufferedOutputStream(new FileOutputStream(file,true))){
            text = text + "\n";
            os.write(text.getBytes());
            os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
