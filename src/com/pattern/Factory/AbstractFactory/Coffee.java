package com.pattern.Factory.AbstractFactory;

/**
 * @program: design_patterns
 * @description: 咖啡类
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public abstract class Coffee {

    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }

    public void addSugar(){
        System.out.println("加糖");
    }
}
