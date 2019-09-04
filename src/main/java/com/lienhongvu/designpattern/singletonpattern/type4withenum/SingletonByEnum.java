package com.lienhongvu.designpattern.singletonpattern.type4withenum;

import com.lienhongvu.designpattern.flyweightpattern.Circle;
import com.lienhongvu.designpattern.flyweightpattern.Shape;

/**
 * Created by hvlien on 1/7/2019.
 * EAGER INSTANTIATION - CLASS LOADING STAGE
 * Instance is created once when class is firstly loaded into JVM
 */
public enum SingletonByEnum {
    INSTANCE;
    Shape shape = new Circle("blue");

    SingletonByEnum() {
    }

    public void doSomething() {
        shape.draw();
    }
}
