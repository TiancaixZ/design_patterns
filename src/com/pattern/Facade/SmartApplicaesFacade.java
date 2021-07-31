package com.pattern.Facade;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-30
 **/
public class SmartApplicaesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicaesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message) {
        if(message.contains("打开")) {
            on();
        } else if(message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    private void on() {
        System.out.println("起床了");
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }
}
