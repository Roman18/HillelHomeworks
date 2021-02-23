package com.company.Homeworks.Homework23.Chain.Handlers;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public class AddressOrderHandler extends OrderHandler {

    @Override
    public void handle(Order o) throws OrderException{
        isExist(o);
        if (o.getAddress() == null){
            throw new OrderException("Укажите адрес доставки!");
        }else{
            checkNext(o);
        }

    }

}
