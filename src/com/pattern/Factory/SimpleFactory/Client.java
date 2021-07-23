package com.pattern.Factory.SimpleFactory;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public class Client {
    public static void main(String[] args) {
        CoffeStore store = new CoffeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
