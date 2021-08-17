package com.pattern.observer;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-15
 **/
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();

        WeixinUser user1=new WeixinUser("孙悟空");
        WeixinUser user2=new WeixinUser("猪悟能");
        WeixinUser user3=new WeixinUser("沙悟净");

        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);

        mSubscriptionSubject.notify("传智黑马的专栏更新了");
    }
}
