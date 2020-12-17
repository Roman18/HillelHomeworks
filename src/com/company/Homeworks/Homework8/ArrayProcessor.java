package com.company.Homeworks.Homework8;

public class ArrayProcessor <T> {
    private  T[]t;
    public ArrayProcessor(T []t){
        this.t=t;
    }

    public void process(ElementProcessor ep){
        for (int i = 0; i <t.length ; i++) {
            ep.run(t[i]);
        }
    }
}
