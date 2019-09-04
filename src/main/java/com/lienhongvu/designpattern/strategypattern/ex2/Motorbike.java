package com.lienhongvu.designpattern.strategypattern.ex2;

/**
 * Created by hvlien on 10/6/2017.
 */
public class Motorbike extends Vehicle {
    public Motorbike() {
        super(new GoByDrivingAlgorithm());
    }
}
