package com.company.Homeworks.Homework8;

public class Run {






    public static void main(String[] args) {
        Integer [] arr={3,2,1};
        String []strings={"hello","bye","world"};
        ElementProcessor<Integer> elementProcessor1=new IntElementProcessor();
        ElementProcessor<String> elementProcessor2=new StringElementProcessor();
        ArrayProcessor<Integer> arrayProcessor1=new ArrayProcessor<>(arr);
        ArrayProcessor<String> arrayProcessor2=new ArrayProcessor<>(strings);
        arrayProcessor1.process(elementProcessor1);
        System.out.println("===========");
        arrayProcessor2.process(elementProcessor2);
    }
}
