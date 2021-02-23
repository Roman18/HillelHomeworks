package com.company.Homeworks.Homework23.Chain;

public class Order {
    private String name;
    private String address;
    private String pizza;


    public Order(String name, String address, String pizza) {
        this.name = name;
        this.address = address;
        this.pizza = pizza;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPizza() {
        return pizza;
    }


    @Override
    public String toString() {
        return "Имя: "+getName()
                +"\n"+"Адрес: "+getAddress()
                +"\n"+"Заказ: "+getPizza()
                +"\n=======\n";
    }
}
