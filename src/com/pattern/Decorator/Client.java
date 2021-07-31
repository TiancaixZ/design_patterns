package com.pattern.Decorator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice(1,"a");
        //花费的价格
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("========");
        //点一份加鸡蛋的炒饭
        FastFood food1 = new FriedRice(2,"b");

        food1 = new Egg(food1);
        //花费的价格
        System.out.println(food1.getDesc() + " " + food1.cost() + "元");

        System.out.println("========");
    }
}
