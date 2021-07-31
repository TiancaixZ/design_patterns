package com.pattern.Bridge;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-29
 **/
public class Client {
    public static void main(String[] args) {
        Mac mac = new Mac(new AviFile());
        mac.play("战狼三");
    }
}
