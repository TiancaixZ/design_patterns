package com.pattern.Adapter.class_Adapter;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        String msg = "sd card read a msg :hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
