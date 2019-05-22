package com.lienhongvu.designpattern.strategypattern;

/**
 * Created by hvlien on 10/6/2017.
 */
public class Airplane extends Vehicle {
    public Airplane() {
        super(new GoByFlyingAlgorithm());
    }
}
