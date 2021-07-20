package com.pattern.Singleton;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class Client {
    public static void main(String[] args) {
        Singleton_Hungry instance = Singleton_Hungry.getInstance();
        Singleton_Hungry instance1 = Singleton_Hungry.getInstance();

        System.out.println(instance== instance1);

        Singleton_Lazy_safe instance_lazy = Singleton_Lazy_safe.getInstance();
        Singleton_Lazy_safe instance_lazy1 = Singleton_Lazy_safe.getInstance();

        System.out.println(instance_lazy  == instance_lazy1);

    }
}
