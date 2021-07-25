package com.pattern.Builder;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-25
 **/
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFream("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
