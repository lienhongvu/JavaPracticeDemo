package com.lienhongvu.designpattern.flyweightpattern;

import lombok.Data;

/**
 * Created by hvlien on 10/12/2017.
 */
@Data
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw: color=" + getColor() +", x=" + getX() + ", y=" + getY() + ", radius=" + getRadius());
    }
}
