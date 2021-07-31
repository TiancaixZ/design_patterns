package com.pattern.Proxy.static_Proxy;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-26
 **/
public class ProxyPoint implements SellTicks {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }

}
