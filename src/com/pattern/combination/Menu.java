package com.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-30
 **/
public class Menu extends MenuComponent{
    private List<MenuComponent> list;

    public Menu(String name, int level) {
        this.level = level;
        this.name = name;
        this.list = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
       list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return list.get(index);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (MenuComponent component : list) {
            component.print();
        }
    }
}
