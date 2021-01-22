package com.company.Homeworks.Homework14;

import java.io.File;
import java.io.IOException;

public class FileFinder {


    public File findAbsoluteFile(File dir, String fileName) {
        dir = dir.getAbsoluteFile();
        File[] files = dir.listFiles();
        if (files.length == 0) { // если папка пустая то выходим
            return null;
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().equals(fileName)) { //нашли папку или файл с нужным именем
                return files[i].getAbsoluteFile();
            } else if (files[i].isDirectory()) {
                File file = findAbsoluteFile(files[i], fileName); //заходим в директорию
                if (file != null) { // если вернулось не null, то выходим из рекурсии с найденым файлом, если null, то ищем дальше
                    return file;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        FileFinder fileFinder = new FileFinder();
        File file = new File("resource");
        System.out.println(fileFinder.findAbsoluteFile(file, "7.txt"));
    }

}
