package com.lienhongvu.designpattern.factorypattern.ex1;

/**
 * Created by hvlien on 10/9/2017.
 */
public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        shape = shapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
