package com.pattern.Flyweight;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-01
 **/
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
