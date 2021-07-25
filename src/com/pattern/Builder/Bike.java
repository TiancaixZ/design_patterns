package com.pattern.Builder;

/**
 * @program: design_patterns
 * @description:
 * @author: Chen2059
 * @create: 2021-07-25
 **/
public class Bike {
    private String fream;
    private String seat;

    public Bike() {
    }

    public Bike(String fream, String seat) {
        this.fream = fream;
        this.seat = seat;
    }

    public String getFream() {
        return fream;
    }

    public void setFream(String fream) {
        this.fream = fream;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "fream='" + fream + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
