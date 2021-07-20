package com.pattern.Singleton;

/**
 * @program: design_patterns
 * @description: 饿汉式 静态变量创建的对象
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class Singleton_Hungry {
    //私有构造方法
    private Singleton_Hungry(){}

    //在成员位置创建该类的对象
    private static Singleton_Hungry instance = new Singleton_Hungry();

    //对外提供静态方法获取该对象
    public static Singleton_Hungry getInstance() {
        return instance;
    }
}
