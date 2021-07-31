package com.pattern.Proxy.jdk_Proxy;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-27
 **/
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets prxoObject = proxyFactory.getPrxoObject();
        prxoObject.sell();

        System.out.println(prxoObject.getClass());

        while (true) {}
    }
}
