package com.pattern.Singleton;

/**
 * @program: design_patterns
 * @description: 饿汉式 线程安全
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class Singleton_Lazy_safe {
    //私有化构造方法
    private Singleton_Lazy_safe(){}

    //在成员位置创建该类的对象
    private static Singleton_Lazy_safe instance = null;

    //在外提供静态方法获取该对象
    public static synchronized Singleton_Lazy_safe getInstance() {
        if (instance == null){
            instance = new Singleton_Lazy_safe();
        }
        return instance;
    }
}
