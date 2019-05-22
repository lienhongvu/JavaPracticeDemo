package com.lienhongvu.designpattern.flyweightpattern;

/**
 * Created by hvlien on 10/12/2017.
 */
public class TestFlyWeight {
    public static void main(String[] args) {

        Circle circle = (Circle) ShapeFactory.getShape("blue");
        circle.setX(1);
        circle.setY(2);
        circle.setRadius(3);

        circle = (Circle) ShapeFactory.getShape("blue");
        System.out.println(circle.toString());
    }
}
