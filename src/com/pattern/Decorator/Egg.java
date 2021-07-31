package com.pattern.Decorator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
