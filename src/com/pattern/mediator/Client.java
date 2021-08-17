package com.pattern.mediator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-08-15
 **/
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);
        Tenant tenant = new Tenant("李四", mediatorStructure);

        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        tenant.constact("需要租三室的房子");
        houseOwner.constact("我这有三室的房子，你需要租吗？");
    }
}
