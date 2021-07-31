package com.pattern.Decorator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class FriedNoodles extends FastFood {

    public FriedNoodles(float price, String desc) {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
