package com.pattern.Flyweight;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-01
 **/
public class Client {
    public static void main(String[] args) {
        AbstractBox i = BoxFactory.getInstance().getBox("I");
        i.display("灰色");
        AbstractBox l = BoxFactory.getInstance().getBox("L");
        l.display("绿色");
        AbstractBox o = BoxFactory.getInstance().getBox("O");
        o.display("灰色");
        AbstractBox o1 = BoxFactory.getInstance().getBox("O");
        o1.display("红色");


    }
}
