package com.lienhongvu.designpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hvlien on 10/12/2017.
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color){
        Circle circle = (Circle) circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Put to map");
        } else {
            System.out.println("Reuse from map");
        }
        return circle;
    }
}
