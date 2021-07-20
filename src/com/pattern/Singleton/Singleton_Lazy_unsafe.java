package com.pattern.Singleton;

/**
 * @program: design_patterns
 * @description: 懒汉式 线程不安全
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class Singleton_Lazy_unsafe {
    private Singleton_Lazy_unsafe(){}

    private static Singleton_Lazy_unsafe getInstance = null;

    public static Singleton_Lazy_unsafe getGetInstance() {
        if (getInstance == null) {
            getInstance = new Singleton_Lazy_unsafe();
        }
        return getInstance;
    }
}
