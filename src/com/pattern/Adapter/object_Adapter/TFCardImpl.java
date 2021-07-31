package com.pattern.Adapter.object_Adapter;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg ="tf card read msg : hello word tf card";
        return msg;
    }

    @Override
    public void write(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}
