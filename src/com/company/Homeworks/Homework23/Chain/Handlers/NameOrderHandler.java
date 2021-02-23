package com.company.Homeworks.Homework23.Chain.Handlers;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public class NameOrderHandler extends OrderHandler {


    @Override
    public void handle(Order o) throws OrderException{
        isExist(o);
        if (o.getName()==null){
            throw new OrderException("Укажите имя!");
        }else {
            checkNext(o);
        }
    }

}
