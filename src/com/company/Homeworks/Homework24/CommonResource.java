package com.company.Homeworks.Homework24;

import java.io.*;

public class CommonResource {
    private final File file = new File("D:\\Hillel\\src\\com\\company\\Homeworks\\Homework24\\res\\out.txt");;


    public void writeInFile(String text) {// общий ресурс для потоков
        synchronized (file) {
            try (OutputStream os = new BufferedOutputStream(new FileOutputStream(file, true))) {
                text = text + "\n";
                os.write(text.getBytes());
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
