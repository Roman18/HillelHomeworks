package com.company.Homeworks.Homework23.Decorator.OrderDecorator;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public class AddressOrderDecorator implements PrintOrder {

    private PrintOrder printOrder;

    public AddressOrderDecorator(PrintOrder printOrder) {
        this.printOrder = printOrder;
    }
    @Override
    public void result(Order o) throws OrderException {
        isExist(o);
        checkAddress(o);
        printOrder.result(o);

    }

    private void checkAddress(Order o)throws OrderException {
        if(o.getAddress()==null){
            throw new OrderException("Укажите адрес!");
        }
    }
}
