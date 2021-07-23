package com.pattern.Factory.SimpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @program: design_patterns
 * @description: 简单咖啡工厂类
 * @author: Chen2059
 * @create: 2021-07-23
 **/
public class SimpleCoffeFactory {
    private static Map<String,Coffee> map = new HashMap();
    static {
        Properties properties = new Properties();
        InputStream stream = SimpleCoffeFactory.class.getClassLoader()
                .getResourceAsStream("factory.properties");
        try {
            properties.load(stream);
            for (Object o : properties.keySet()) {
                //根据键获取值（全类名）
                String className = properties.getProperty((String) o);
                //获取字节码对象
                Class clazz = Class.forName(className);
                Coffee obj = (Coffee) clazz.newInstance();
                map.put((String)o,obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public  Coffee createCoffee(String type){
        return map.get(type);
    }
}
