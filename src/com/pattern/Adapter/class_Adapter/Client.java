package com.pattern.Adapter.class_Adapter;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        SDAdapterTF adapter = new SDAdapterTF();
        System.out.println(computer.readSD(adapter));
    }
}
