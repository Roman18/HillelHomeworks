package com.company.Homeworks.Homework23.Chain.Handlers;

import com.company.Homeworks.Homework23.Chain.Exception.OrderException;
import com.company.Homeworks.Homework23.Chain.Order;

public abstract class OrderHandler {
    private OrderHandler next;


    public OrderHandler linkWith(OrderHandler next) {  //для создания цепочки
        this.next = next;
        return next;
    }
    public abstract void handle(Order o);   // метод фильтрации

    protected void checkNext(Order o) {           // проверка есть ли следующий фильтр
        if (next == null) {
            System.out.println("Заказ принят!");
        }else {
            next.handle(o);
        }

    }

    protected void isExist(Order o)throws OrderException { //Если заказ пришёл null
        if (o == null){
            throw new OrderException("Возникла проблема!\nПриносим свои извинения!");
        }
    }
}
