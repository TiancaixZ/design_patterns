package com.pattern.Singleton;

import java.io.Serializable;

/**
 * @program: design_patterns
 * @description: 懒汉式 内部类
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class Singleton_Lazy_inner implements Serializable {
    private static boolean flag = false;

    private Singleton_Lazy_inner(){
        synchronized (Singleton_Lazy_doublecheck.class){
            if(flag){
                throw new RuntimeException("不能创建");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton_Lazy_inner instance = new Singleton_Lazy_inner();
    }

    public static Singleton_Lazy_inner getInstance() {
        return SingletonHolder.instance;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.instance;
    }
}
