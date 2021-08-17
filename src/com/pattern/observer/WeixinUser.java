package com.pattern.observer;

import com.pattern.observer.Observer;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-15
 **/
public class WeixinUser implements Observer{
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }

}
