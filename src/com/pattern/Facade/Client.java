package com.pattern.Facade;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-30
 **/
public class Client {
    public static void main(String[] args) {
        SmartApplicaesFacade facade = new SmartApplicaesFacade();
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}
