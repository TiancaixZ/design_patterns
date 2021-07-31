package com.pattern.Proxy.jdk_Proxy;

import com.pattern.Proxy.static_Proxy.SellTicks;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-27
 **/
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站买票");
    }

}
