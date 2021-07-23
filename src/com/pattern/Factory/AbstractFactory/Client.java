package com.pattern.Factory.AbstractFactory;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public class Client {
    public static void main(String[] args) {

        CoffeStore store = new CoffeStore(new LatteCoffeeFactory());
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
