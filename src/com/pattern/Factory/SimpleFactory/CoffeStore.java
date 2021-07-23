package com.pattern.Factory.SimpleFactory;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public class CoffeStore {

    public Coffee orderCoffee(String type){
        SimpleCoffeFactory factory = new SimpleCoffeFactory();
        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
