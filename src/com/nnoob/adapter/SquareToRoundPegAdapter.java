package com.nnoob.adapter;

/**
 * @author: niezhiqiang
 * @date: 2021/6/17 21:18
 * @description: 方钉到圆孔的适配器
 */
public class SquareToRoundPegAdapter extends RoundPeg{

    private final SquarePeg squarePeg;


    public SquareToRoundPegAdapter(SquarePeg peg) {
       this.squarePeg=peg;
    }


    @Override
    public double getRadius() {
        System.err.println(Math.pow((squarePeg.getWidth() / 2), 2));
        System.err.println(Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));

        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
