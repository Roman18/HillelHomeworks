package com.company.Homeworks.Homework23.Decorator.OrderDecorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public class PizzaOrderDecorator implements PrintOrder {
    private PrintOrder printOrder;

    public PizzaOrderDecorator(PrintOrder printOrder) {
        this.printOrder = printOrder;
    }
    @Override
    public void result(Order o) {
        checkPizza(o);
        printOrder.result(o);
    }

    private void checkPizza(Order o)throws OrderException {
        if(o.getPizza()==null){
            throw new OrderException("Укажите заказ!");
        }
    }
}
