package com.pattern.Decorator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class FriedRice extends FastFood {

    public FriedRice(float price, String desc) {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
