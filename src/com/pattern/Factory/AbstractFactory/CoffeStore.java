package com.pattern.Factory.AbstractFactory;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public class CoffeStore {
    private CoffeeFacotry facotry;

    public CoffeStore(CoffeeFacotry facotry) {
        this.facotry = facotry;
    }

    public Coffee orderCoffee(){
        Coffee coffee = facotry.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
