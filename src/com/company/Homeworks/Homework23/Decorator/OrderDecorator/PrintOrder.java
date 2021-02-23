package com.company.Homeworks.Homework23.Decorator.OrderDecorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public interface PrintOrder {
    void result(Order o) throws OrderException;


    default void isExist(Order o) throws OrderException{    //Если заказ пришёл null
        if (o == null){
            throw new OrderException("Возникла проблема!\nПриносим свои извинения!");
        }
    }
}
