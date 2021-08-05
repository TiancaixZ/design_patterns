package com.pattern.Flyweight;

import java.util.HashMap;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-01
 **/
public class BoxFactory {
    private static HashMap<String, AbstractBox> map;

    private BoxFactory(){
        map = new HashMap();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    private static class SingletonHolder{
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public final static BoxFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static AbstractBox getBox(String key){
        return map.get(key);
    }
}
