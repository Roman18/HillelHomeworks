package com.company.Homeworks.Homework23.Chain.Handlers;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

import java.io.*;

public class FileOrderHandler extends OrderHandler {
    private File file = new File("orders.txt");

    @Override
    public void handle(Order o) {
        isExist(o);
        try (OutputStream in = new BufferedOutputStream(new FileOutputStream(file, true))) {
            in.write(o.toString().getBytes());
            in.flush();
            checkNext(o);
        } catch (IOException e) {
            throw new OrderException("Проблемы с файлом!");
        }
    }


}
