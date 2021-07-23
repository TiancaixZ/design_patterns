package com.pattern.Factory.AbstractFactory;

/**
 * @program: design_patterns
 * @description: 拿铁工厂类
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public class LatteCoffeeFactory implements CoffeeFacotry{

    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }
}
