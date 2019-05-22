package com.lienhongvu.designpattern.factorypattern.ex1;

/**
 * Created by hvlien on 10/9/2017.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        switch (shapeType.toUpperCase()) {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default: return null;
        }
    }

}
