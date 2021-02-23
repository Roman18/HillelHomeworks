package com.company.Homeworks.Homework23.Chain;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Handlers.*;

public class Main1 {


    public static void main(String[] args) {
        Order order=new Order("Sasha","st. Filosovska","barbeky");
        OrderHandler chain = new NameOrderHandler();
        chain.linkWith(new AddressOrderHandler()).
                linkWith(new PizzaOrderHandler()). // создание цепочки
                linkWith(new FileOrderHandler());
        try {
            chain.handle(order);
        }catch (OrderException e){
            System.out.println(e.getMessage());
        }
    }
}
