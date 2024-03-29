package com.pattern.Decorator;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-28
 **/
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public abstract float cost();
}
