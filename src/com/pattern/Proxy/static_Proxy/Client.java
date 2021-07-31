package com.pattern.Proxy.static_Proxy;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-26
 **/
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxy = new ProxyPoint();
        proxy.sell();
    }
}
