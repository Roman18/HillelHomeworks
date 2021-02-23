package com.company.Homeworks.Homework23.Decorator.OrderDecorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public class DefaultPrintOrder implements PrintOrder {
    @Override
    public void result(Order o) throws OrderException{// Основная логика
        isExist(o);
        System.out.println("Ваш заказ!\n"+o.toString());
        System.out.println("Заказ принят!");
    }
}
