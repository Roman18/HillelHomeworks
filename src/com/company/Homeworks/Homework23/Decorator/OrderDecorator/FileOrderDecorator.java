package com.company.Homeworks.Homework23.Decorator.OrderDecorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

import java.io.*;

public class FileOrderDecorator implements PrintOrder {
    // Использую тот-же файл что и в цепочке
    private File file = new File("D:\\Hillel\\src\\com\\company\\Homeworks\\Homework23\\orders.txt");
    private PrintOrder printOrder;

    public FileOrderDecorator(PrintOrder printOrder) {
        this.printOrder = printOrder;
    }

    @Override
    public void result(Order o) throws OrderException{
        isExist(o);
        try (OutputStream in = new BufferedOutputStream(new FileOutputStream(file, true))) {
            in.write(o.toString().getBytes());
            in.flush();
            printOrder.result(o);
        } catch (IOException e) {
            throw new OrderException("Проблемы с файлом!");
        }
    }



}
