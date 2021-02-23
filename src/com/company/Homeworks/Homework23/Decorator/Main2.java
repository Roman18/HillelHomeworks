package com.company.Homeworks.Homework23.Decorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;
import com.company.Homeworks.Homework23.Decorator.OrderDecorator.*;

public class Main2 {


    public static void main(String[] args) {
        Order order=new Order("Vasia","street","4 cheeses"); // Использую тот-же класс что и в цепочке
        PrintOrder printOrder=new DefaultPrintOrder();
        printOrder = new FileOrderDecorator(printOrder);
        printOrder = new NameOrderDecorator(printOrder);  // Завернули основную логику проврками
        printOrder = new AddressOrderDecorator(printOrder);
        printOrder = new PizzaOrderDecorator(printOrder);
        try {
            printOrder.result(order);
        }catch (OrderException e){
            System.out.println(e.getMessage());
        }
    }
}
