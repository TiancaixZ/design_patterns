package com.pattern.combination;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-30
 **/
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
