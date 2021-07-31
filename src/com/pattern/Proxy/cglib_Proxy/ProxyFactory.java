package com.pattern.Proxy.cglib_Proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(station.getClass());
        enhancer.setCallback(this);
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }

    /*
    intercept方法参数说明：
        o ： 代理对象
        method ： 真实对象中的方法的Method实例
        args ： 实际参数
        methodProxy ：代理对象中的方法的method实例
 */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        TrainStation result = (TrainStation) methodProxy.invokeSuper(o, objects);
        return result;
    }
}
