package com.pattern.mediator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-15
 **/
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message, this);
    }

    public void getMessage(String message){
        System.out.println("租房者" + name + "获取到的信息：" + message);
    }
}
