package com.company.Homeworks.Homework23.Decorator.OrderDecorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public class NameOrderDecorator implements PrintOrder {
    private PrintOrder printOrder;

    public NameOrderDecorator(PrintOrder printOrder) {
        this.printOrder = printOrder;
    }

    @Override
    public void result(Order o) throws OrderException{
        isExist(o);
        checkName(o);
        printOrder.result(o);
    }

    private void checkName(Order o)throws OrderException{
        if(o.getName()==null){
            throw new OrderException("Укажите имя!");
        }
    }
}
