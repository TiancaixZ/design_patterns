package com.pattern.Builder;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-25
 **/
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

    public Bike construct(){
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
