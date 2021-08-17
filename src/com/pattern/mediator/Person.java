package com.pattern.mediator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-15
 **/
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
