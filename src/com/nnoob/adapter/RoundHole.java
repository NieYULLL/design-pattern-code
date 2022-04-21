package com.nnoob.adapter;



/**
 * @author: niezhiqiang
 * @date: 2021/6/17 21:13
 * @description: 圆孔
 */
public class RoundHole {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits( RoundPeg peg) {
        return this.radius >= peg.getRadius();

    }
}
