package com.pattern.Builder;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-25
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println(new OfoBuilder().construct().getFream());
        System.out.println(new MobikeBuilder().construct().getFream());

        phone phone = new phone.Builder()
                .cpu("intel")
                .mainboard("asus")
                .memory("king")
                .screen("lg")
                .build();
        System.out.println(phone);

    }
}
