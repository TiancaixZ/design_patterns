package com.pattern.Singleton;

/**
 * @program: design_patterns
 * @description: 双重检查锁
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class Singleton_Lazy_doublecheck {


    private Singleton_Lazy_doublecheck(){
    }
    
    private static volatile Singleton_Lazy_doublecheck instance = null;

    public static Singleton_Lazy_doublecheck getInstance() {
        if (instance  == null){
            synchronized (Singleton_Lazy_doublecheck.class){
                if (instance == null){
                    instance = new Singleton_Lazy_doublecheck();
                }
            }
        }
        return instance;
    }
}
