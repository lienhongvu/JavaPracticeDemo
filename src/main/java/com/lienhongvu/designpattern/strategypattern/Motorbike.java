package com.lienhongvu.designpattern.strategypattern;

/**
 * Created by hvlien on 10/6/2017.
 */
public class Motorbike extends Vehicle {
    public Motorbike() {
        super(new GoByDrivingAlgorithm());
    }
}
