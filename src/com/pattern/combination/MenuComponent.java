package com.pattern.combination;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-30
 **/
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public abstract void print();
}
